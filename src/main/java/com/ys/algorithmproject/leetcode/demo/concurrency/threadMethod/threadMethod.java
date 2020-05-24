package com.ys.algorithmproject.leetcode.demo.concurrency.threadMethod;

/**
 * Create by YSOcean
 */
public class threadMethod {
    static  volatile boolean ready = false;
    static int number = 0;

    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            while(!ready);
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws Exception{
        new ReaderThread().start();
        Thread.sleep(1000);
        number = 42;
        ready = true;
        Thread.sleep(1000);
    }
}
