package com.thread.RentrantLockPractice;

public class ReentrantTryLockMain {
    public static void main(String[] args) {
        RentrantWithTryLock rentrantWithTryLock = new RentrantWithTryLock("first");
        RentrantWithTryLock rentrantWithTryLock1 = new RentrantWithTryLock("second");
        rentrantWithTryLock.start();
        rentrantWithTryLock1.start();
    }
}
