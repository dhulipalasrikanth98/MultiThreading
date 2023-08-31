package com.thread.synchronization;

public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        FirstThread firstThread = new FirstThread(d,"srikanth");
        Thread t1 = new Thread(firstThread);
        FirstThread secondThread = new FirstThread(d,"valli");
        Thread t2 = new Thread(secondThread);
        t1.start();
        t2.start();
    }
}
