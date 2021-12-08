package com.example.bug.controller;


import com.example.bug.entity.Detail;
import com.example.bug.entity.User;
import com.example.bug.service.DetailService;
import com.example.bug.service.ExecService;
import com.example.bug.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BugController  {

    @Resource
    private DetailService detailService;
    @Resource
    private UserService userService;

    @Resource
    private ExecService execService;

    //初始化
    @RequestMapping("/")
    public String init(@RequestParam(value = "pid",required = false) Integer pid, HttpServletRequest request){
        System.out.println(pid);
        List<Detail> detailList = detailService.getAll(pid);
        List<User> userList = userService.getAllU();
        request.setAttribute("detailList",detailList);
        request.setAttribute("userList",userList);
        request.setAttribute("pid",pid);
        return "index";
    }


//    @Override
//    public String init(Integer pid, HttpServletRequest request) {
//        List<Detail> detailList = detailService.getAll(pid);
//        List<User> userList = userService.getAllU();
//        request.setAttribute("detailList",detailList);
//        request.setAttribute("userList",userList);
//        request.setAttribute("pid",pid);
//        return "index";
//    }

    //跳往添加页面
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser( HttpServletRequest request){
        //下拉框
        List<User> userList = userService.getAllU();
        request.setAttribute("userList",userList);

        return "addDetail";
    }

    //添加功能
    @RequestMapping(value = "/addDetails",method = RequestMethod.POST)
    public String addDetails(int pid,int severity,String title,String user){
        detailService.addDetails(pid, severity, title, user);
        return "redirect:/";
    }

//    @Override
//    public String addDetails(int pid, int severity, String title, String user) {
//        detailService.addDetails(pid, severity, title, user);
//        return "redirect:/";
//    }

    @RequestMapping("/t1")
    @ResponseBody
    public String t1(){
        for (int i=0;i<20;i++){
            execService.exec1(i);
            execService.exec2(i);
        }
        return "success";
    }
}
