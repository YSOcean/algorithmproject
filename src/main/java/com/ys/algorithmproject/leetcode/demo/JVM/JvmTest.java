package com.ys.algorithmproject.leetcode.demo.JVM;


/**
 * Create by YSOcean
 */
public class JvmTest {
public static void main(String[] args) {

    Person father = new Person();
    Person son = new Person();
    father.setSon(son);
    father.setFather(father);

    father = null;
    son = null;

    /**
     * 调用此方法表示希望进行一次垃圾回收。但是它不能保证垃圾回收一定会进行，
     * 而且具体什么时候进行是取决于具体的虚拟机的，不同的虚拟机有不同的对策。
     */
    System.gc();
}


}
