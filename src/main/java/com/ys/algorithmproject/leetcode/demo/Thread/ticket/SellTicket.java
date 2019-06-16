package com.ys.algorithmproject.leetcode.demo.Thread.ticket;

/**
 * Create by YSOcean
 */
public class SellTicket implements Runnable{

    public int num = 100;

    @Override
    public  void run() {
        try {

            while(true){
                synchronized(this){
                    if(num > 0){
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"卖出了一张票，剩余"+(--num));
                    }else{
                        break;
                    }

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
        t2.start();
        t1.start();
        t3.start();


        SellTicket sellTicket = new SellTicket();
    }
}
