package com.thread.synchronization.block;

public class Display {
   public  synchronized void m1(String name){
       System.out.println("Does thread hold lock:"+Thread.holdsLock(Display.class));
        //display object lock
       synchronized (Display.class){
           System.out.println("Does thread hold lock:"+Thread.holdsLock(Display.class));
           for(int i = 0; i < 10; i++){
               System.out.print("Good Morning");
               try{
                   Thread.sleep(2000);
               }
               catch (InterruptedException interruptedException){}
               System.out.println(name);
           }

       }
       synchronized (Display.class){
           System.out.println("Does thread hold lock : "+Thread.holdsLock(Display.class));
           for(int i = 0; i < 10; i++){
               System.out.print("Happy Birthday");
               try{
                   Thread.sleep(2000);
               }
               catch (InterruptedException interruptedException){}
               System.out.println(name);
           }
       }

   }
}
