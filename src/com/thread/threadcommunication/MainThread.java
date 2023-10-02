package com.thread.threadcommunication;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();
        waitNotifyDemo.start();

        synchronized (waitNotifyDemo){
            System.out.println("Main thread calling wait method");

           waitNotifyDemo.wait();
            System.out.println("main thread got notification");
            System.out.println(waitNotifyDemo.total);
        }
    }
}
