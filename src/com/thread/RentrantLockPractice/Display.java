package com.thread.RentrantLockPractice;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock reentrantLock = new ReentrantLock();
    public void wish(String name){
        reentrantLock.lock();
        for(int i = 0; i < 10;i++) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
            }
            System.out.println(name);
        }
        reentrantLock.unlock();

    }

}
