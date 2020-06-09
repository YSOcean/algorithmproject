package com.ys.algorithmproject.leetcode.demo.concurrency.jmm;

import com.ys.algorithmproject.leetcode.easy.CountAndSay;

/**
 * Create by YSOcean
 * 可见性演示
 */
public class VisibilityDemo extends Thread{
//    public static int count = 0;
//
//    @Override
//    public void run() {
//        synchronized (VisibilityDemo.class){
//            int i = 0;
//
//            while (i++ < 100000) {
//                System.out.println(Thread.currentThread().getName());
//                count++;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) throws Exception{
//        VisibilityDemo thread1 = new VisibilityDemo();
//        VisibilityDemo thread2 = new VisibilityDemo();
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(count);
//
//    }
}
