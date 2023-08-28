package com.thread.sleep;

public class SleepThread implements Runnable{
    @Override
    public void run() {

            try {
                for(int i = 0 ; i < 10; i++) {
                    System.out.println("Slide - " + i);
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                System.out.println("got interrupted");
            }
    }
}
