package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：房屋抢劫，用一个数组中每个元素模拟每个房子里的钱，如果一个晚上连续抢劫两间挨着一起的房子，那么房子就会报警。
 *      如何保证一个晚上能够抢到最多的钱
 * 例子：Input: [1,2,3,1] Output: 4，抢第1个房子跟第3个房子，刚好1+3=4
 *      Input: [2,7,9,3,1] Output: 12，抢第1一个房子跟第三个房子，还有第5个房子，一共2+9+1=12
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        //Initialize an arrays to store the money
        int[] mark = new int[nums.length];

        //We can infer the formula from problem:mark[i]=max(num[i]+mark[i-2],mark[i-1])
        //so initialize two nums at first.
        mark[0] = nums[0];
        mark[1] = Math.max(nums[0], nums[1]);

        //Using Dynamic Programming to mark the max money in loop.
        for(int i=2;i<nums.length;i++){
            mark[i] = Math.max(nums[i]+mark[i-2], mark[i-1]);
        }
        return mark[nums.length-1];
    }
}
