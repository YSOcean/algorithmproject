package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个数组以及一个值，删除该数组中等于该值的元素，然后返回剩下不等于该值元素的个数
 * 例子：nums = [3,2,2,3], val = 3，return 2; nums = [0,1,2,2,3,0,4,2], val = 2 return 5
 * 要求：不允许使用额外的空间
 */
public class RemoveElement {


    /**
     * 思路比较简单，初始化一个变量从0开始，然后遍历数组，遇到不等于给定值的元素直接依次赋值到该数组
     */
    public int removeElementTest1(int[] nums, int val) {
        if(nums == null){
            return 0;
        }
        int result = 0;
        for(int n : nums){
            if(n != val){
                nums[result++] = n;
            }
        }
        return result;
    }



    /**
     * 类似上面的思路，遍历数组，遇到等于给定值的元素，然后首尾交换位置，首位置遍历指针不变，尾部指针+1
     */
    public int removeElementTest2(int[] nums, int val) {
        if(nums == null){
            return 0;
        }
        int lastIndex = nums.length - 1;
        for (int i = 0; i < lastIndex + 1; i++) {
            if(nums[i] == val){
                nums[i] = nums[lastIndex];
                lastIndex--;
                i--;
            }
        }
        return lastIndex+1;
    }
}
