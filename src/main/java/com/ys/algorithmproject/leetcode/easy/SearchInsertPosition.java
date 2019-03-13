package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给一个有序数组以及一个目标值，如果从该数组中找到该目标值，则返回该值的索引；
 *       如果没有找到，则按顺序插入该值，并返回插入后的索引。
 * 例子：[1,3,5,6], 5 返回2；[1,3,5,6], 7返回4
 */
public class SearchInsertPosition {

    /**
     * 遍历给定数组，依次和给定目标值进行比较，如果遍历的索引位置元素大于或者等于给定目标值，则返回当前索引；
     *              如果整体遍历完数组都没有遇到大于等于给定目标值的索引，说明目标值大于数组所有元素，
     *              插入到数组最后一个位置，返回最后一个位置的索引。
     * 时间复杂度：O(n)
     */
    public int searchInsertTest1(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 优化1：由于数组是有序的，所以可以不需要依次遍历整个数组，采用二分法遍历
     * 二分法遍历：不断的取数组中间元素去比较目标值
     * 时间复杂度：O(log(n))
     * 空间复杂度：O(1)
     */
    public int searchInsertTest2(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int firstIndex = 0;
        int lastIndex = nums.length-1;
        while(lastIndex>=firstIndex){
            int midIndex = firstIndex+(lastIndex-firstIndex)/2;
            if(nums[midIndex] == target){
                return midIndex;
            }else if(nums[midIndex] < target){
                firstIndex = midIndex+1;
            }else{
                lastIndex = midIndex-1;
            }
        }
        return firstIndex;
    }

}
