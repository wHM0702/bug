package com.example.bug.utils;

public class T3 extends Thread{

    @Override
    public void run() {
        for(int i =1;i<100000;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            if(this.isInterrupted()){
                System.out.println("第一个"+this.isInterrupted());
                System.out.println("第二个"+this.isInterrupted());
                break;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new T3();
        t1.start();
        Thread.sleep(3000);
        t1.interrupt();

    }
}
