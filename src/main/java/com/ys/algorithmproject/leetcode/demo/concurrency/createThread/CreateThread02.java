package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

/**
 * Create by YSOcean
 */
public class CreateThread02 implements Runnable {

    @Override
    public void run() {
        //doSomething()
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new CreateThread02());
        t1.start();
    }
}
