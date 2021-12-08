package com.example.bug.utils;

public class T1 implements Runnable {

    private int num = 100;


    @Override
    public synchronized void run() {
        for (int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
