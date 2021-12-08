package com.example.bug.utils;

import java.util.concurrent.Callable;

public class Call1<V> implements Callable<V> {

    V num;

    public Call1(V num) {
        this.num = num;
    }

    @Override
    public V call() throws Exception {
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            Thread.sleep(1000);
        }
        return num;
    }
}
