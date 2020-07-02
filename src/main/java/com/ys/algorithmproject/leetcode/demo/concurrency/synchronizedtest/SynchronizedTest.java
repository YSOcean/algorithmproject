package com.ys.algorithmproject.leetcode.demo.concurrency.synchronizedtest;


/**
 * Create by ItCoke
 */
public class SynchronizedTest implements Runnable{

    public volatile static int count = 0;

    Object objMonitor = new Object();

    @Override
    public void run() {
        addCount();

    }

    public void addCount(){

        synchronized(objMonitor){
             int i = 0;
            while (i++ < 100000) {
                count++;
            }
            printCount();
        }
    }

    public void printCount(){
        synchronized (objMonitor){
            System.out.println(count);
        }
    }


    public static void main(String[] args) throws Exception{
        SynchronizedTest obj = new SynchronizedTest();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        obj.method1();

    }



    public synchronized void method1(){
        System.out.println("method1");
        method2();

    }

    public synchronized void method2(){
        System.out.println("method2");
    }


    public void lockRemoveTest(String s1){
        Object monitor = new Object();
        synchronized (monitor){
            //TODO
        }
    }


    public String lockRemoveTest(){

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append("word");
        return sb.toString();
    }


Object monitor = new Object();
public void lockCoarsingTest(){
    //Object monitor = new Object();
    synchronized (monitor){
        //TODO
    }
    synchronized (monitor){
        //TODO
    }
    synchronized (monitor){
        //TODO
    }
}

}

