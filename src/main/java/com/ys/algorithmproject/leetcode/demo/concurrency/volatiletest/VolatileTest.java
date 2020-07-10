package com.ys.algorithmproject.leetcode.demo.concurrency.volatiletest;

import sun.misc.Unsafe;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

/**
 * Create by YSOcean
 */
public class VolatileTest implements Runnable{
    public static volatile int count = 0;


    @Override
    public void run() {
        CountDownLatch downLatch = new CountDownLatch(3);
        List list = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception{
        VolatileTest vt = new VolatileTest();
        Thread t1 = new Thread(vt);
        Thread t2 = new Thread(vt);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}

