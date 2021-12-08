package com.example.bug.utils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallTest {

    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Call1(222));
        new Thread(futureTask).start();

        FutureTask futureTask1  = new FutureTask(new Call2("whm"));
        new Thread(futureTask1).start();

        try {
            System.out.println(futureTask.get());
            System.out.println(futureTask1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
