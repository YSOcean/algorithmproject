package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个非空的整数数组，只有一个元素出现一次，其余每个元素都出现两次，找到出现一次的那个返回
 * 注意：尽量使用线性复杂度，且不使用额外的空间
 * 例子：[2,2,1]返回1；[4,1,2,1,2]返回4
 */
public class SingleNumber {

    /**
     * 由于数字在计算机是以二进制存储的，每位上都是0或1，如果我们把两个相同的数字异或，
     * 0与0异或是0,1与1异或也是0，那么我们会得到0。
     * 根据这个特点，我们把数组中所有的数字都异或起来，则每对相同的数字都会得0，
     * 然后最后剩下来的数字就是那个只有1次的数字。
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
