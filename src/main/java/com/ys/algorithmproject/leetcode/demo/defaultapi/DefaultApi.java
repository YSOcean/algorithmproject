package com.ys.algorithmproject.leetcode.demo.defaultapi;

public interface DefaultApi {
    void test1();

    default void test2(){
        System.out.println("默认方法");
    }
}
