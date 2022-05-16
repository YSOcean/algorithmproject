package com.ys.algorithmproject.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * https://leetcode.cn/problems/single-number/
 */
public class SingleNumber {

    // hashmap 判断一次或者多次都可以，但是有额外使用空间
    public int singleNumber(int[] nums) {
        if(nums == null && nums.length == 0){
            throw new NullPointerException("nums is Empty");
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer se : integers) {
            if(map.get(se) == 1){
                return se;
            }
        }
        throw new ArithmeticException("no singleNumber");
    }


    // hashset 依次遍历存放，如果存在了就丢弃，直到最后一个
    public int singleNumber2(int[] nums) {
        if(nums == null && nums.length == 0){
            throw new NullPointerException("nums is Empty");
        }
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        if(set.size() == 1){
            return set.iterator().next();
        }
        throw new ArithmeticException("no singleNumber");
    }

    /**
     * 任何数和 00 做异或运算，结果仍然是原来的数，即 a \oplus 0=aa⊕0=a。
     * 任何数和其自身做异或运算，结果是 00，即 a \oplus a=0a⊕a=0。
     * 异或运算满足交换律和结合律，即 a \oplus b \oplus a=b \oplus a \oplus a=b \oplus (a \oplus a)=b \oplus0=ba⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
     *
     * @param nums
     * @return
     */
    public int singleNumber3(int[] nums) {
        if(nums == null && nums.length == 0){
            throw new NullPointerException("nums is Empty");
        }
        int result = 0;
        for(Integer n : nums){
            result ^= n;
        }
        return result;
    }
}
