package com.thread.synchronization.staticpractice;



public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        NewThread firstThread = new NewThread();
        Thread t1 = new Thread(firstThread);

        SecondThread secondThread = new SecondThread();
        Thread t2 = new Thread(secondThread);

        ThridThread thirdThread = new ThridThread();
        Thread t3 = new Thread(thirdThread);

        FourthThread fourthThread = new FourthThread(d);
        Thread t4 = new Thread(fourthThread);

        t1.start();//m1
        t2.start();//m1
        t3.start();//m2
        t4.start();//m3
    }
}
