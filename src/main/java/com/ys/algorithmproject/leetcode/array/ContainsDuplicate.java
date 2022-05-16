package com.ys.algorithmproject.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * https://leetcode.cn/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    // 解法1：hash表
    public boolean containsDuplicate1(int[] nums) {
        if(nums == null && nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    // 解法2：排序后判断
    public boolean containsDuplicate2(int[] nums) {
        if(nums == null && nums.length == 0){
            return false;
        }
        quickSort(nums,0,nums.length - 1);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void quickSort(int[] nums , int left ,int right){
        if(left >= right){
            return;
        }
        int partition = getPartition(nums,left,right);
        quickSort(nums , left,partition - 1);
        quickSort(nums , partition + 1 , right);
    }

    private static int getPartition(int[] nums, int left, int right) {
        int i = left;
        int j = right + 1;
        int pivot = nums[left];
        while(true){
            while(i < right && nums[++i] < pivot){
            }
            while(j > 0 && nums[--j] > pivot){
            }
            if(i < j){
                swap(nums,i,j);
            }else{
                break;
            }
        }
        if(left != j){
            swap(nums,left,j);
        }
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,9,8,2,7,6,4};

        quickSort(array,0,array.length - 1);
        System.out.println(array);
    }
}
