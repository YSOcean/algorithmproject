package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：翻转32位无符号整数
 * 例子：Input: 00000010100101000001111010011100 Output: 00111001011110000010100101000000
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int rlt = 0;

        for(int i = 32 ; i > 0 ; i--){
            rlt += (((n<<(i-1))>>>31)<<(i-1));
        }

        return rlt;
    }
}
