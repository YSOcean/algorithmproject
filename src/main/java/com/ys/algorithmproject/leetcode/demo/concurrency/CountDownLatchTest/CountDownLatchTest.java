package com.ys.algorithmproject.leetcode.demo.concurrency.CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Create by YSOcean
 */
public class CountDownLatchTest {


    public static void main(String[] args){
        System.out.println("开始组装电脑");

        CountDownLatch diyComputer = new CountDownLatch(3);

        new Thread(()->{
            try{
                //模拟组装耗时
                Thread.sleep(1000);
                System.out.println("组装显示器");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                diyComputer.countDown();
            }
        }).start();

        new Thread(()->{
            try{
                //模拟组装耗时
                Thread.sleep(1000);
                System.out.println("组装主机");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                diyComputer.countDown();
            }
        }).start();

        new Thread(()-> {
            try {
                //模拟组装耗时
                Thread.sleep(1000);
                System.out.println("组装其它零件");
            }catch (Exception e){
                e.printStackTrace();
            } finally {
                diyComputer.countDown();
            }
        }).start();


        try{
            diyComputer.await();

        }catch (Exception e){

        }

        System.out.println("组装电脑完毕");

    }


}
