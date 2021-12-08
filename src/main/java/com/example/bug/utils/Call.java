package com.example.bug.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Call implements Callable {

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public  Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"开始了");

        for(int i =0;i<15;i++) {
            Thread.sleep(100);
            if(i<10){
                System.out.println(Thread.currentThread().getName()+i);
            }else{
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+i);
                }finally {
                    lock.unlock();
                }


            }

        }






        System.out.println(Thread.currentThread().getName()+"结束了");
        return "xx";
    }
}
