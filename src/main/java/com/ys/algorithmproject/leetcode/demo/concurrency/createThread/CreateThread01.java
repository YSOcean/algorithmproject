package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

/**
 * Create by YSOcean
 */
public class CreateThread01 extends Thread {

    @Override
    public void run() {
        System.out.println("子线程开始运行："+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程运行结束："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("主线程开始运行");
        CreateThread01 c1 = new CreateThread01();
        c1.start();
        System.out.println("主线程结束");
    }
}
