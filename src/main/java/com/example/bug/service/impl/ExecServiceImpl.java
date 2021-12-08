package com.example.bug.service.impl;

import com.example.bug.service.ExecService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ExecServiceImpl implements ExecService {

    @Override
    @Async("whm")
    public void exec1(int i) {
        System.out.println(Thread.currentThread().getName()+"-"+i);
    }

    @Override
    @Async("whm")
    public void exec2(int i) {
        System.out.println(Thread.currentThread().getName()+"-"+i);
    }
}
