package com.example.bug.utils.anli;

public class Test {

    public static void main(String[] args) {
        new Thread(new Action()).start();
        new Thread(new Action()).start();
        new Thread(new Action()).start();

    }
}
