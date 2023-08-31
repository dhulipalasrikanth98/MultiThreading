package com.thread.synchronization.staticpractice;

public class FourthThread implements Runnable{
    Display d;
    FourthThread(Display d){
        this.d = d;
    }
    @Override
    public void run() {
        d.m5();
    }
}
