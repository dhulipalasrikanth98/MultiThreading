package com.thread.DeadLock;

public class First {
    synchronized void m1(Second second){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        second.last();
    }

    public synchronized void last() {
        for(int i = 0; i < 10;i++){
            System.out.println(i);
        }
    }
}
