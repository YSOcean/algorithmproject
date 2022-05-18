package com.ys.algorithmproject.leetcode.array;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
// 你可以按任意顺序返回答案。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
//
// 示例 2：
//
//
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//
//
// 示例 3：
//
//
//输入：nums = [3,3], target = 6
//输出：[0,1]
//
//
//
//
// 提示：
//
//
// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// 只会存在一个有效答案
//
//
// 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
// Related Topics 数组 哈希表
// 👍 14428 👎 0


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 解法1：两层遍历，O(N2)
     * ①、遍历外层，得到一个值
     * ②、遍历内层，判断是否有值为 target-外层值
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        int[] newNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == result){
                    newNums[0] = i;
                    newNums[1] = j;
                    return newNums;
                }
            }
        }
        return newNums;
    }


    /**
     * 解法2：一次遍历-hashmap，O(N)
     * ①、遍历
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        int[] newNums = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                newNums[0] = map.get(target-nums[i]);
                newNums[1] = i;
                return newNums;
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("not found target from nums");
    }

}
