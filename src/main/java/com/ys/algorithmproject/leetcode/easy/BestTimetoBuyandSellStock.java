package com.ys.algorithmproject.leetcode.easy;


/**
 * Create by YSOcean
 * 题目：假设有一个数组，其中第i个元素是当天股票的价格，一次只能完成一比交易（买一份股票，然后卖出去）
 *      根据给定的股票价格，算出买卖的最大利润
 * 注意：没买之前是不能出售股票的，并且只能进行一次买卖交易。
 * 例子：[7,1,5,3,6,4]，我们算出最大利润为5（在第二天买入股票，价格为1，然后在第5天卖掉，价格为6，差价为6-1=5）
 *       [7,6,4,3,1]，我们算出最大利润为0，因为这是一个越来越小的数组，卖出的价格一定小于等于买入的价格。
 */
public class BestTimetoBuyandSellStock {

    /**
     * 只需要遍历一次数组，用一个变量记录遍历过数中的最小值，
     * 然后每次计算当前值和这个最小值之间的差值最为利润，
     * 然后每次选较大的利润来更新。当遍历完成后当前利润即为所求
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            min = Math.min(min,price);
            max = Math.max(price-min,max);
        }
        return max;
    }
}
