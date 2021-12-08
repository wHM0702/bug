package com.example.bug.utils.secu;

public class Ticket {

    public int num;

    public Ticket(int num) {
        this.num = num;
    }

    public void chupiao(int i){
        int xxx=0;
//        synchronized (this){
            if(num-i<0){
                return;
            }
            num-=i;
            xxx=num;
            System.out.println(Thread.currentThread().getName()+"出票"+i+"张，剩余："+xxx);
//        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(Thread.currentThread().getName()+"再说一遍，出票"+i+"张，剩余："+xxx);
    }
}
