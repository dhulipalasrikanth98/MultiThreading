package com.thread.callable;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable {
    int val;
    CallableDemo(int val){
        this.val = val;
    }
    @Override
    public Object call() throws Exception {
        System.out.println("Executed by"+Thread.currentThread().getName());
        int sum = 0;
        for(int i = 0; i < val; i++){
            sum=sum+i;
        }
        return val;
    }
}
