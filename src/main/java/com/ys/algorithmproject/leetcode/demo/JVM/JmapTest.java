package com.ys.algorithmproject.leetcode.demo.JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by YSOcean
 *
 */
public class JmapTest {
    private static final int _1MB = 1024*1024;

    /**
     * 虚拟机参数设置： -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./
     * @param args
     */
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while(true){
            list.add(new Object[_1MB]);
        }
    }
}
