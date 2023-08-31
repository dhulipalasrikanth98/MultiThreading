package com.thread.synchronization;

public class FirstThread implements Runnable{
    Display d;
    String name;
    @Override
    public void run() {
        d.wish(this.name);
    }
    FirstThread(Display d,String name){
        this.d = d;
        this.name = name;
    }
}
