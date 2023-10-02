package com.thread.interrupt;

public class InterruptDemoThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            Thread.currentThread().setName("child thread");
            System.out.println("child Thread started..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " "+i);
        }
    }
}
