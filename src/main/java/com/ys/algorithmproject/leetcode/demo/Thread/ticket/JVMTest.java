package com.ys.algorithmproject.leetcode.demo.Thread.ticket;


/**
 * @ Copyright (C), 2015-2019, kxjl.com
 * @ Author:   shuaiyu
 * @ Date:     Created in 2019/7/1 14:50
 * @ Description:
 * @ Modified By：
 * @ Version: 1.0
 */
public class JVMTest {



    //-verbose:gc
    public static void main(String[] args) {
        People father = new People();
        People son = new People();
        father.setSon(son);
        son.setFather(father);
        father = null;
        son = null;
        System.gc();

        System.out.println(father);
        System.out.println(son);
        System.gc();
    }
}
