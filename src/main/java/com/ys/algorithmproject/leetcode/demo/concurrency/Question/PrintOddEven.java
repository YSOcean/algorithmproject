package com.ys.algorithmproject.leetcode.demo.concurrency.Question;

/**
 * Create by YSOcean
 * 用两个线程交替打印奇数和偶数
 */
public class PrintOddEven {
    private static volatile int i = 0;
    public static final Object objMonitor = new Object();

    public static class OddEvenThread implements Runnable{

        @Override
        public void run() {
            synchronized (objMonitor){
                while(true){
                    System.out.println(Thread.currentThread().getName()+":"+i++);
                    objMonitor.notify();
                    try {
                        Thread.sleep(1000);
                        objMonitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }
    }


    public static void main(String[] args) {
        new Thread(new OddEvenThread(),"奇数").start();
        new Thread(new OddEvenThread(),"偶数").start();
    }
}
