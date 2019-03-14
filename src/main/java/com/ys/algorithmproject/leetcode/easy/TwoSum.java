package com.ys.algorithmproject.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by YSOcean
 * 题目：给定一个数组，返回这个数组的两个下标索引，使得其表示的值之和等于目标值
 * 要求：1.数组同一个元素不能使用两次
 *       2.每个输入只有一个解决方案
 *       第一个要求好理解，第二个只有一个解决方法，说明给定的数组没有重复的。假设有重复的[1,2,2,3,4],目标值是5，
 *   那么返回结果可能为[1,3]或者[2,3],因为数组值为2的下标有两个分别为1,2，返回的结果也有两个，这与题目要求只有
 *   一个解决方案冲突了，所以数组是不能重复的。
 */
public class TwoSum {

    /**
     * 暴力解法：通过两层循环遍历
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int[] twoSumTest1(int[] nums , int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * HashMap：利用哈希表常量级别的查找效率，第一次遍历数组,建立<数组值, 数组下标>的键值对关系HashMap；
     *          第二次遍历数组，查找HashMap是否存在<目标值-数组值，数组下标>的键值对。
     *          注意：两个数组下标值是不能相等的。
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSumTest2(int[] nums , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //为什么是nums[i]为key，因为根据题目要求是假设了数组值不能重复的。所以这里不存在哈希冲突
            map.put(nums[i],i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if(map.containsKey(temp) && map.get(temp)!=j){
                return new int[]{j,map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * HashMap：还是利用哈希表常量级别的查找效率
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSumTest3(int[] nums , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                return new int[]{i,map.get(temp)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
