package com.ys.algorithmproject.leetcode.demo.Thread.ticket;

/**
 * @ Copyright (C), 2015-2019, kxjl.com
 * @ Author:   shuaiyu
 * @ Date:     Created in 2019/7/1 14:48
 * @ Description:
 * @ Modified By：
 * @ Version: 1.0
 */
public class People {
    private Byte[] _10MB = new Byte[10*1024*1024];
    private People father;
    private People son;

    public People getFather() {
        return father;
    }

    public void setFather(People father) {
        this.father = father;
    }

    public People getSon() {
        return son;
    }

    public void setSon(People son) {
        this.son = son;
    }

}
