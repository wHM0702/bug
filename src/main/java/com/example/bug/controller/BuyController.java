package com.example.bug.controller;

import com.alibaba.fastjson.JSON;
import com.example.bug.config.RedisUtils;
import com.example.bug.dao.UserDao;
import com.example.bug.model.vo.BuyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class BuyController {

    @Resource
    private UserDao userDao;
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/buy/{pid}/{bid}")
    public String buy(@PathVariable int pid, @PathVariable int bid){
        BuyInfo info = new BuyInfo(bid,pid);
        String jsonInfo = JSON.toJSONString(info);

        //在redis中查询
//        String stock = ((String ) redisUtils.get("[" + pid + "]"));
//        String substring = stock.substring(1, 3);
        int stock = new Integer((String) redisUtils.get("stock"));
        if(stock<=0){
            System.out.println("没有了，不用排队了");
            return "没了";
        }
        jmsTemplate.convertAndSend("whm",jsonInfo);
        System.out.println(bid+"-预订到了-"+pid);
        return "已预约";
    }

    @JmsListener(destination = "whm")
    @Transactional
    public void deal(String json){
        try {
            while (!redisUtils.setnx("suo","xx")){
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        BuyInfo info = JSON.parseObject(json, BuyInfo.class);
        int pid = info.getPid();
        int bid = info.getBid();
        int stock = new Integer((String) redisUtils.get("stock"));
        System.out.println(bid+"来购买，目前库存："+stock);
        if(stock>0){
            //添加订单信息
            boolean a = userDao.insertBuy(bid,pid);
            //减库存
            boolean b = userDao.updProduct(pid);
            if(a && b){
                stock--;
                redisUtils.set("stock",stock+"");
                System.out.println(bid+"购买了一个");
            }
        }else {
            System.out.println(bid+"来购买，但没货了");
        }
        redisUtils.delete("suo");
    }

//    @PostConstruct
//    public void t1(){
//        List<Integer> strings = userDao.queryID();
//        List<Integer> strings1 = userDao.queryStock();
//        String s="";
//        String s1 = "";
//        for (Integer integer : strings) {
//           s = JSON.toJSONString(integer);
//            System.out.println(s);
//        }
//        for (Integer integer1 : strings1) {
//            s1 = JSON.toJSONString(integer1);
//            System.out.println(s1);
//        }
//        redisUtils.set(s,s1);
//    }
}
