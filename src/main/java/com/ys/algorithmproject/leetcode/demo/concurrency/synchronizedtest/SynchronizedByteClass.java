package com.ys.algorithmproject.leetcode.demo.concurrency.synchronizedtest;

/**
 * Create by YSOcean
 */
public class SynchronizedByteClass {
    Object objMonitor = new Object();

    public synchronized void method1(){
        System.out.println("Hello synchronized 1");
    }

    public synchronized static void method2(){
        System.out.println("Hello synchronized 2");
    }

    public void method3(){
        synchronized(objMonitor){
            System.out.println("Hello synchronized 2");
        }

    }

    public void method4(){
        synchronized(objMonitor){
            System.out.println("Hello synchronized 2");
            throw new RuntimeException();
        }

    }

    public static void main(String[] args) {

    }
}
