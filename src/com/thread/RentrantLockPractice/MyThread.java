package com.thread.RentrantLockPractice;

public class MyThread extends Thread{
    Display display;
    String name;
    MyThread(Display d,String name){
        this.display =d;
        this.name = name;
    }
    public void run(){
        display.wish(name);
    }
}
