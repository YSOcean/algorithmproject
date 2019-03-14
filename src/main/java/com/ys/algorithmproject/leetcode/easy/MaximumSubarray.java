package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个整数数组num，查找具有最大和的连续子数组（至少包含一个数字），并返回其和。
 * 例子：[-2,1,-3,4,-1,2,1,-5,4]，输出6，因为最大连续子数组为[4,-1,2,1]
 */
public class MaximumSubarray {


    /**
     *
     */
    public static int maxSubArrayTest1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int currMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax+nums[i],nums[i]);
            max = Math.max(max,currMax);
        }
        return max;
    }

    /**
     *
     */
    public static int maxSubArrayTest2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] > 0){
                nums[i] = nums[i-1]+nums[i];
            }
            if(currMax < nums[i]){
                currMax = nums[i];
            }
        }
        return currMax;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArrayTest1(nums);
    }
}
