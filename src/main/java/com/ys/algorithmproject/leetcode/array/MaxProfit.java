package com.ys.algorithmproject.leetcode.array;

// 买卖股票的最佳时机 1
// https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {
    // 暴力
    public static int maxProfit(int prices[]) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxPofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if((prices[j] - prices[i]) > maxPofit){
                    maxPofit = prices[j] - prices[i];
                }
            }
        }
        return maxPofit;
    }

    // 一次遍历
    public static int maxProfit2(int prices[]){
        if(prices == null || prices.length == 0){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                if(maxProfit < prices[i]-minPrice){
                    maxProfit = prices[i]-minPrice;
                }
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,4,6,3,2,9};
        int i = maxProfit2(nums);
        System.out.println(i);
    }
}






















class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
