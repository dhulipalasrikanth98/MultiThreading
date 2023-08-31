package com.thread.synchronization.staticpractice;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        Display.m2();
    }
}
