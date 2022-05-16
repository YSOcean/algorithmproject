package com.ys.algorithmproject.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * //给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现
 * //次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
 * // 提示：
 * // 1 <= nums1.length, nums2.length <= 1000
 * // 0 <= nums1[i], nums2[i] <= 1000
 *
 * https://leetcode.cn/problems/intersection-of-two-arrays-ii/
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null){
            return nums1;
        }
        if(nums2 == null){
            return nums2;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num1 : nums1){
            if(map.containsKey(num1)){
                map.put(num1,map.get(num1)+1);
            }else{
                map.put(num1,1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Integer num2 : nums2){
            if(map.containsKey(num2) && map.get(num2)>0){
                list.add(num2);
                map.put(num2,map.get(num2)-1);
            }
        }
        int[] newArray = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            newArray[i] = list.get(i);
        }
        return newArray;
    }

}
