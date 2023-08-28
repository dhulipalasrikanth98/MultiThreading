package com.thread.join;

public class JoinThread implements Runnable{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " "+i);
        }

    }

}
