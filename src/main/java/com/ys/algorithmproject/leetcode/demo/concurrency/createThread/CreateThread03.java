package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Create by YSOcean
 */
public class CreateThread03 implements Callable {

    @Override
    public Object call() throws Exception {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            num +=i;
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        CreateThread03 c3 = new CreateThread03();
        FutureTask futureTask = new FutureTask(c3);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
