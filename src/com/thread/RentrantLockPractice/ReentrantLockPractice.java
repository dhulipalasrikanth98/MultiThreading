package com.thread.RentrantLockPractice;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockPractice {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.lock();
        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.getHoldCount());
        System.out.println(reentrantLock.getQueueLength());
        System.out.println(reentrantLock.isFair());
        reentrantLock.unlock();
        System.out.println(reentrantLock.isLocked());
        reentrantLock.unlock();
        System.out.println(reentrantLock.isLocked());


    }
}
