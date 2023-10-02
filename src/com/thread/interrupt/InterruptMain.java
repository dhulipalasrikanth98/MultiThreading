package com.thread.interrupt;

public class InterruptMain {
    public static void main(String[] args) {
        InterruptDemoThread interruptDemoThread = new InterruptDemoThread();
        Thread thread = new Thread(interruptDemoThread);
        thread.start();
        thread.interrupt();
    }
}
