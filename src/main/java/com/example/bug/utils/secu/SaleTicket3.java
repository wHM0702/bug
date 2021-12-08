package com.example.bug.utils.secu;

public class SaleTicket3 extends Thread {

    private Ticket ticket;

    public SaleTicket3(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket.num>0){
            int i = (int)(Math.random()*3+1);
            if(ticket.num-i<0){
                System.out.println(Thread.currentThread().getName()+"没有了"+i);
                continue;
            }
            ticket.chupiao(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
