package com.thread.RentrantLockPractice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class RentrantWithTryLock extends Thread{
    static ReentrantLock reentrantLock = new ReentrantLock();
    public RentrantWithTryLock(String name){
        super(name);
    }
    public void run(){
        do{
            try{
                if(reentrantLock.tryLock(5, TimeUnit.SECONDS)){
                    System.out.println(Thread.currentThread().getName() +"has the lock");

                        Thread.sleep(50000);
                        reentrantLock.unlock();

                    System.out.println(Thread.currentThread().getName()+"releases the lock");
                    break;
                }
                else{
                    System.out.println("next thread wait for the lock");
                }
            }
            catch (Exception e){}
        }while(true);
    }

}
