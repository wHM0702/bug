package com.example.bug.utils.secu;

import java.util.concurrent.Callable;

public class SaleTicket4 implements Callable {

    private Ticket ticket;

    public SaleTicket4(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public  Object call() throws Exception {
        while (ticket.num>0){
            int i = (int)(Math.random()*3+1);
            if(ticket.num-i<0){
                System.out.println(Thread.currentThread().getName()+"没有了"+i);
                continue;
            }
            synchronized (this){
                ticket.chupiao(i);
            }

            Thread.sleep(1000);
        }

        return ticket;
    }
}
