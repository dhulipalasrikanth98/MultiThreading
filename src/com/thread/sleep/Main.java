package com.thread.sleep;

public class Main {
    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread();
        Thread thread = new Thread(sleepThread);
        thread.interrupt();
        thread.start();


    }
}
