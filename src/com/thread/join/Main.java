package com.thread.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        JoinThread.mt = Thread.currentThread();

        JoinThread joinThread = new JoinThread();
        Thread thread = new Thread(joinThread);
        thread.start();
        Thread.currentThread().setName("main");
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " "+i);
        }

    }
}
