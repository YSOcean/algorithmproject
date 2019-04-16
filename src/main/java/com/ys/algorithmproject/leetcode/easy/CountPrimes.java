package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个值，统计小于该值的素数个数
 * 例子：Input: 10  Output: 4，分别是2, 3, 5, 7
 */
public class CountPrimes {

    public int countPrimes(int n) {
        if (n < 3){
            return 0;
        }
        boolean[] f = new boolean[n];
        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (f[i]){
                continue;
            }

            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }
}
