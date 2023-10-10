package com.thread.callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo[] callableDemo = {
                                        new CallableDemo(20),
                                       new CallableDemo(10),
                                       new CallableDemo(30),
                                         new CallableDemo(50),
                                        new CallableDemo(70),
                                        new CallableDemo(90)

        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(CallableDemo c : callableDemo){
           Future f = executorService.submit(c);
            System.out.println(f.get());
        }
        executorService.shutdown();

    }
}
