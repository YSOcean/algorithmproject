package com.ys.algorithmproject.leetcode.array;

// 轮转数组
// https://leetcode.cn/problems/rotate-array/
public class Rotate {

    // 创建一个额外数组
    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return;
        }
        int n = nums.length;
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[(i+k)%n] = nums[i];
        }
        //System.arraycopy(newArray,0,nums,0,n);
        for (int i = 0; i < newArray.length; i++) {
            nums[i] = newArray[i];
        }
    }

    /**
     * 多次翻转
     * ①、先整体翻转
     * ②、翻转前0~k-1 个元素
     * ③、翻转后k~nums.length 个元素
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return;
        }
        rotateNum(nums,0,nums.length-1);
        rotateNum(nums,0,k-1);
        rotateNum(nums,k,nums.length-1);
    }
    public static void rotateNum(int[] nums , int left , int right){
        for (int i = 0; i < (right-left); i++) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        rotate2(nums,2);
        System.out.println();
    }
}
