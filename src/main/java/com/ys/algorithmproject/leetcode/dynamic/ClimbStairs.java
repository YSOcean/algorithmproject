package com.ys.algorithmproject.leetcode.dynamic;

public class ClimbStairs {

    /**
     * 递归会超时
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int l = 1;
        int q = 2;
        int temp = 3;
        for (int i = 4; i <= n; i++) {
            l = q;
            q = temp;
            temp = q + l;
        }
        return temp;
    }
}
