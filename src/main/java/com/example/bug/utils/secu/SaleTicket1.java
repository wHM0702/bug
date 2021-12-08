package com.example.bug.utils.secu;

public class SaleTicket1 extends Thread{

    private static int num = 10;

    @Override
    public void run() {
        while (true){
            if(num>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张票");
                num--;
            }else{
                break;
            }
        }
    }
}
