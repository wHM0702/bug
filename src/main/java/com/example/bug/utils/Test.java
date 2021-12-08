package com.example.bug.utils;

import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) {
//        Call ca = new Call();
//        FutureTask futureTask = new FutureTask(ca);
//        FutureTask futureTask2 = new FutureTask(ca);
//        new Thread(futureTask).start();
//        new Thread(futureTask2).start();

        T4 t4 = new T4();
        Thread t1 = new Thread(t4);
        Thread t2 = new Thread(t4);
        t1.start();
        t2.start();


    }



}
