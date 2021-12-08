package com.example.bug.utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T4 implements Runnable {

    private  int ticket = 10;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
                try {
                    lock.lock();
                    if (ticket>0){
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket +"张票" );
                        ticket--;
                    }else{
                        return;
                     }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
}
