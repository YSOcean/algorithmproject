package com.ys.algorithmproject.leetcode.easy;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by YSOcean
 * 题目：给定一个大小为n的数组，找到多数元素。多数元素超过了n/2
 * 注意：假定数组是非空的，并且给定数组是一定存在多数元素的
 * 例子：[3,2,3]，返回3；[2,2,1,1,1,2,2]返回2；
 */
public class MajorityElement {

    /**
     * 利用hashmap数据结构，依次遍历数组，将数组元素作为key存入hashmap中。
     * 如果map中不存在该元素，那么存入<n,1>
     * 如果map中存在该元素，那么存入<n,map.get(n)+1>
     * 最后判断map.get(n)>length/2
     */
    public int majorityElementTest1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
            if(map.get(n)>nums.length/2){
                return n;
            }
        }
        throw new ArithmeticException("NO Majority Element");
    }


    /**
     * 将给定数组排序，然后取中间位的元素
     * 因为题目已经给定了，一定存在最多的元素
     */
    public int majorityElementTest2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    /**
     * 摩尔投票法：在每一轮投票过程中，从数组中找出一对不同的元素，将其从数组中删除。
     *              这样不断的删除直到无法再进行投票，如果数组为空，
     *              则没有任何元素出现的次数超过该数组长度的一半。
     *              如果只存在一种元素，那么这个元素则可能为目标元素。
     * 因为题目已经给定了，一定存在最多的元素，所以我们可以遍历数组，假定第一个元素是最多的那个
     * 然后判断下一个，如果相等则计数器+1，如果不等，则计数器-1
     * 最后遍历完后，最多的元素一定是计数器>=0的时候
     */
    public int majorityElementTest3(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0){
                ret = num;
            }
            if (num!=ret){
                count--;
            }
            else{
                count++;
            }
        }
        return ret;
    }
}
