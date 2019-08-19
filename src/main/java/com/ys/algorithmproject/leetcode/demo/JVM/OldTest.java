package com.ys.algorithmproject.leetcode.demo.JVM;

/**
 * Create by YSOcean
 * 大对象直接在老年代上分配
 */
public class OldTest {
    private static final int _1MB = 1024*1024;

    /**
     * 虚拟机参数设置：-XX:+UseParallelGC -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        byte[] a = new byte[8*_1MB];

    }
}
