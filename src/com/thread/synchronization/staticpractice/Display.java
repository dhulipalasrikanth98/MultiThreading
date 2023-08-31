package com.thread.synchronization.staticpractice;

public class Display {
    public static synchronized void m1(){
        for(int i = 0; i < 3; i++){
            System.out.println("first static synchronized "+i);
        }
    }
    public static synchronized void m2(){
        for(int i = 0; i < 3; i++) {
            System.out.println("second static synchronized "+i);
        }
    }
    public static void m3(){
        System.out.println("static method m3");
    }
    public synchronized void m4(){
        for(int i = 0; i < 3; i++){
            System.out.println("synchronized");
        }
    }
    public void m5(){
        System.out.println("normal method");
    }
}
