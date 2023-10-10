package com.thread.threadgroup;

public class ThreadGroupPractice {
    public static void main(String[] args) {
//        ThreadGroup g = new ThreadGroup("abc");
//        System.out.println(g.getParent().getName());
//        ThreadGroup threadGroup = new ThreadGroup(g,"xyz");
//
//        System.out.println(threadGroup.getParent().getName());
//        System.out.println(g.getMaxPriority());
//        g.list();
//        System.out.println(g.activeCount());

        //Write a program to display the all the parent groups and child groups
       ThreadGroup parent =  Thread.currentThread().getThreadGroup().getParent();
       //parent.list();
        Thread[] t = new Thread[parent.activeCount()];
        parent.enumerate(t);
        for(Thread name : t){
            System.out.println(name.getName() +" "+name.isDaemon());

        }


    }
}
