package com.example.bug.utils.secu;

public class SaleTicket2 implements Runnable {

    private int num = 30;

    @Override
    public void run() {
        while (true){
            synchronized (this){
              if (num>0){
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }else{
                  break;
              }
            }
        }
    }
}
