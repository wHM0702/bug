package com.example.bug.utils.secu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Ticket ticket = new Ticket(20);
        SaleTicket4 saleTicket4 = new SaleTicket4(ticket);
        executorService.submit(saleTicket4);
        executorService.submit(saleTicket4);
        executorService.submit(saleTicket4);
        executorService.submit(saleTicket4);
        executorService.submit(saleTicket4);
        executorService.submit(saleTicket4);
        executorService.shutdown();
    }

}
