package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：移除有序数组中重复的元素，并返回移除之后数组的长度
 * 例子：[1,1,2] 返回2，[0,0,1,1,1,2,2,3,3,4]返回5
 * 要求：不要使用额外的空间，在空间复杂度O(1)的情况下完成。
 */
public class RemoveDuplicatesArray {


    public static int removeDuplicatesTest1(int[] nums) {
       if(nums == null){
           return 0;
       }
       int i = 0;
       for(int n : nums){
           if(i == 0 || n > nums[i-1]){
               nums[i++] = n;
           }
       }
       return i;
    }



    public static int removeDuplicatesTest2(int[] nums) {
        if(nums == null){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j-1]){
                i++;
            }
            nums[j-i] = nums[j];
        }
        return nums.length-i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicatesTest1(nums);
        Integer integer = new Integer(169);
        long l2 = 123;
        long ln = Long.parseLong(integer.toString());
        System.out.println(ln);


    }
}
