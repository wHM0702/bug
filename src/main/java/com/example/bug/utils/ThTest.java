package com.example.bug.utils;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThTest {

    public static void main(String[] args) {
        //提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) executorService;

        T1 t1 = new T1();
        T2 t2 = new T2();
        Call1 call1 = new Call1(222);

//        service1.execute(t1);
//
//        service1.execute(t1);

        service1.submit(call1);

        service1.submit(call1);

        executorService.shutdown();
    }




}
