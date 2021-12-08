package com.example.bug.utils;

import java.util.concurrent.Callable;

public class Call2<T> implements Callable<T> {

    T name;

    public Call2(T name) {
        this.name = name;
    }

    @Override
    public T call() throws Exception {
        System.out.println(name);
        return name;
    }
}
