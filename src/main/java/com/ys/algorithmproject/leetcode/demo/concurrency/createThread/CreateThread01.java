package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

/**
 * Create by YSOcean
 */
public class CreateThread01 extends Thread {

    @Override
    public void run() {
        //doSomething()
    }

    public static void main(String[] args) {
        CreateThread01 c1 = new CreateThread01();
        CreateThread01 c2 = new CreateThread01();
        c1.start();
        c2.start();

    }
}
