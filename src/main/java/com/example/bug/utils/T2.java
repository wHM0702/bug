package com.example.bug.utils;

public class T2 extends Thread{

    @Override
    public void run() {
        System.out.println("aaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
