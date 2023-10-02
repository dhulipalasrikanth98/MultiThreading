package com.thread.threadcommunication;

public class WaitNotifyDemo extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            for(int  i = 0; i < 10; i++){
                total = total + i;
            }

           this.notify();
            System.out.println("Main thread notified");
        }
    }
}
