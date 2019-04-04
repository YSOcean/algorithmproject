package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个按照升序排列的数组，返回这个数组的两个下标索引，使得其表示的值之和等于目标值
 * 要求：1.数组同一个元素不能使用两次
 *       2.每个输入只有一个解决方案
 *       第一个要求好理解，第二个只有一个解决方法，说明给定的数组没有重复的。假设有重复的[1,2,2,3,4],目标值是5，
 *   那么返回结果可能为[1,3]或者[2,3],因为数组值为2的下标有两个分别为1,2，返回的结果也有两个，这与题目要求只有
 *   一个解决方案冲突了，所以数组是不能重复的。
 * 另外：返回的两个索引，是从数组1开始的，并且第一个索引值必须小于第二个索引值
 */
public class TwoSumII {

    /**
     * 二分查找法：由于数组是有序的,首先整体遍历数组，然后再用二分查找法找到第二个target-遍历值的值
     * 时间复杂度：O(nlogn)
     */
    public int[] twoSumTest1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int left = i+1;
            int right = numbers.length - 1;
            while(left <= right){
                int mid = left + (right-left)/2;
                if(numbers[mid] == target - numbers[i]){
                    return new int[]{i+1,mid+1};
                }else if(numbers[mid] > target - numbers[i]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }


    /**
     * 两个指针：构造两个指针分别从数组头部以及尾部进行遍历，如果两个指针所指的位置值大于target,那么右指针向左一定一位；
     *           如果两个指针所指的位置值小于target,那么左指针向右移动一位；
     *           如果正好等于target,那么直接返回两个索引位置的值（分别加1）
     */
    public int[] twoSumTest2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if((numbers[left] + numbers[right]) == target){
                return new int[]{left+1,right+1};
            }else if((numbers[left] + numbers[right]) > target){
                right--;
            }else{
                left++;
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }
}
