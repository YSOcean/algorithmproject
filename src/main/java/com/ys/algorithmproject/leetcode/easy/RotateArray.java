package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个数组，将数组向右旋转k步，其中k为非负。
 * 例子：Input: [1,2,3,4,5,6,7] and k = 3    Output: [5,6,7,1,2,3,4]
 *       Input: [-1,-100,3,99] and k = 2     Output: [3,99,-1,-100]
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


