package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个整数，返回其阶乘后结果末尾0的个数
 * 例子：3，返回0，因为3！=6；5，返回1，因为5！=120，末尾有一个0
 */
public class FactorialTrailingZeroes {

    /**
     * 求末尾0的个数，也就是要找阶乘中10的个数，而10可以分解为2跟5，2的数量远大于5
     * 也就是说得出5的个数即可。
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
