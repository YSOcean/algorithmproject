package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：假设有一个数组，其中第i个元素是当天股票的价格，对比前一题目（121），这里可以进行多次交易
 *      根据给定的股票价格，算出买卖的最大利润
 * 注意：没买之前是不能出售股票的
 * 例子：[7,1,5,3,6,4]，我们算出最大利润为7
 *      （在第二天买入股票，价格为1，然后在第3天卖掉，价格为5，差价为5-1=4，
 *        然后在第4天买入，价格为3，然后在第5天卖掉，价格为6，差价为6-3=3
 *        总共利润为；4+3=7）
 */
public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profit;
    }
}
