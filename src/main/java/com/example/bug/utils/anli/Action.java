package com.example.bug.utils.anli;

public class Action implements Runnable {

    public void jump(){
        synchronized (this){
            System.out.println("开始了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"跳了一半");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("跳完了");
        }
    }


    @Override
    public void run() {
        for (int i = 0;i<3;i++){
            jump();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
