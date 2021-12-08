package com.example.bug.utils.secu;

public class Test {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(20);

        SaleTicket3 s1 = new SaleTicket3(ticket);
        SaleTicket3 s2 = new SaleTicket3(ticket);
        SaleTicket3 s3 = new SaleTicket3(ticket);

        s1.setName("a");
        s2.setName("b");
        s3.setName("c");

        s1.start();
        s2.start();
        s3.start();
    }


}
