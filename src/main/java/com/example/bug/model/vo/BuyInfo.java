package com.example.bug.model.vo;

public class BuyInfo {

    int bid,pid;

    public BuyInfo(int bid, int pid) {
        this.bid = bid;
        this.pid = pid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
