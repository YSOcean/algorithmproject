package com.ys.designpatterns.single;

import java.util.stream.IntStream;

/**
 * Create by YSOcean
 */
public class LazySingleton {
    private LazySingleton(){}

    public static LazySingleton instance;
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();

        new Thread(()->{
            System.out.println(LazySingleton.getInstance());
        }).start();
    }
}
