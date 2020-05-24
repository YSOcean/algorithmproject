package com.ys.algorithmproject.leetcode.demo.concurrency.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Create by YSOcean
 */
public class CreateThread03 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.sleep(1000);
            num +=i;
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        CreateThread03 c3 = new CreateThread03();
        FutureTask<Integer> futureTask = new FutureTask<>(c3);
        for (int i = 0; i < 100; i++) {
            if (i == 20){
                Thread thread = new Thread(futureTask);
                thread.start();
            }
        }
        System.out.println("主线程for循环执行完毕");

        //get方法会一直阻塞，知道call方法运行完毕
        int num = futureTask.get();
        System.out.println(num);//打印结果为：45（从1一直加到9）

        System.out.println("主线程执行完毕");
    }
}
