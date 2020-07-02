package com.ys.algorithmproject.leetcode.demo.concurrency.CountDownLatchTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create by YSOcean
 */
public class DiyComputerThread extends Thread{
    private String name;

    public DiyComputerThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(name);
        }catch (Exception e){

        }

    }
}
