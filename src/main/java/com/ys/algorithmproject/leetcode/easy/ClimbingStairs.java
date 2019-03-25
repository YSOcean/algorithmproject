package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：爬楼梯，给定一个N阶的楼梯，每次可以爬一层或者二层，能有多少种方式爬到顶层。
 * 例子：N=2，结果为2，可以一次爬1层，爬两次；也可以一次就爬两层，总共两种方式
 * 分析：其实这个和斐波那契数列比较像，f(n) = f(n-1) + f(n-2)
 */
public class ClimbingStairs {

    /**
     * 递归：注意此方法会造成运行超时，AC无法通过
     */
    public int climbStairsTest1(int n) {
        if(n<=2){
            return n;
        }
        return climbStairsTest1(n-1)+climbStairsTest1(n-2);
    }


    /**
     * 递推：由上面递归方法改写
     */
    public int climbStairsTest2(int n) {
        if(n<=2){
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }
}
