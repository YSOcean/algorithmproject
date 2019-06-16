package com.ys.algorithmproject.leetcode.demo.string;

/**
 * Create by YSOcean
 */
public class StringTest {
    public static void main(String[] args) {
        Person p1 = new Person("张三",21);
        Person p2 = new Person("张三",21);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));


        String str1 = "hello";
        String str3 = new String("hello");
        System.out.println(str1 == str3.intern());
    }
}
