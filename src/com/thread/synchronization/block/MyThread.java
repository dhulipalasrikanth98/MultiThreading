package com.thread.synchronization.block;

public class MyThread implements Runnable{

    Display d;
    String name;
    MyThread(Display d,String name){
        this.d = d;
        this.name = name;
    }
    @Override
    public void run() {
        d.m1(name);
    }
}
