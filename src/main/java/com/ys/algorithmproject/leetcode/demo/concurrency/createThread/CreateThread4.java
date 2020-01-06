package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create by YSOcean
 */
public class CreateThread4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                //doSomething()
            }
        });
    }


}
