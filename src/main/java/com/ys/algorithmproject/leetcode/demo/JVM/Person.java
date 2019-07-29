package com.ys.algorithmproject.leetcode.demo.JVM;

/**
 * Create by YSOcean
 */
public class Person {

    private Byte[] _1MB = null;

    public Person() {
        /**
         * 这个成员属性的作用纯粹就是占据一定内存，以便在日志中查看是否被回收
         */
        _1MB = new Byte[1*1024*1024];
    }



    private Person father;
    private Person son;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getSon() {
        return son;
    }

    public void setSon(Person son) {
        this.son = son;
    }
}
