package com.thread.DeadLock;

public class DeadLockThread extends Thread {
    First first = new First();
    Second second = new Second();
    public void d1(){
        this.start();
        second.m2(first);
    }
    public void run(){
        first.m1(second);
    }
    public static void main(String[] args) {

        DeadLockThread deadLockThread = new DeadLockThread();
        deadLockThread.d1();
    }

}
