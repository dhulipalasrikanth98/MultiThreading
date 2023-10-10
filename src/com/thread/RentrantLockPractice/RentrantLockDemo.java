package com.thread.RentrantLockPractice;

import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockDemo {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread myThread = new MyThread(display,"dhoni");
        MyThread myThread1 = new MyThread(display,"yuvraj");
        myThread.start();
        myThread1.start();
    }
}
