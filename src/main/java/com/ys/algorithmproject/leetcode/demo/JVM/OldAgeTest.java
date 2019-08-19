package com.ys.algorithmproject.leetcode.demo.JVM;

/**
 * Create by YSOcean
 * 新生代对象经过N次Minor GC后，晋升到老年代
 */
public class OldAgeTest {
    private static final int _1MB = 1024*1024;

    /**
     * 虚拟机参数设置：-XX:MaxTenuringThreshold=1 -XX:+UseParallelGC -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        byte[] a = new byte[_1MB];
        System.gc();

    }

}
