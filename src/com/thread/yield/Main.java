package com.thread.yield;

public class Main {
    public static void main(String[] args) {
        YieldDemo yieldDemo = new YieldDemo();
        Thread thread = new Thread(yieldDemo);
        thread.setName("first");
        thread.setPriority(5);
        thread.start();

        NotStopping notStopping = new NotStopping();
        Thread thread1 = new Thread(notStopping);
        thread1.setName("second");
        thread1.setPriority(5);
        thread1.start();

    }
}
