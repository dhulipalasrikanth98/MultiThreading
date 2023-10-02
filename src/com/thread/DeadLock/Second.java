package com.thread.DeadLock;

public class Second {
    synchronized void m2(First first){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        first.last();
    }

    public synchronized void last() {
        for(int i = 0; i < 10;i++){
            System.out.println(i);
        }
    }
}
