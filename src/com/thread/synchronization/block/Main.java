package com.thread.synchronization.block;

public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread myThread = new MyThread(d,"srikanth");
        Thread thread = new Thread(myThread);
        MyThread m = new MyThread(d,"valli");
        Thread t = new Thread(m);
        t.start();
        thread.start();




    }
}
