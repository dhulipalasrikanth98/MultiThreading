package com.thread.Deamon;

public class DeamonPractice {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        Thread.currentThread().setDaemon(true);
    }
}
