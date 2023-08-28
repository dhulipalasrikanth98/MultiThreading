package com.thread.yield;

public class Main {
    public static void main(String[] args) {
        YieldDemo yieldDemo = new YieldDemo();
        Thread thread = new Thread(yieldDemo);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        NotStopping notStopping = new NotStopping();
        Thread thread1 = new Thread(notStopping);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

    }
}
