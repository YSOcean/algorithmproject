package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：计算并返回一个数x的平方根
 * 注意：x是非负整数，并且如果结果有小数，则去掉小数，只返回整数部分。
 * 例子：x=4,返回2；x=8,也返回2，因为8的平方根是2.82842...，去掉小数部分，返回整数2
 */
public class Sqrt {

    /**
     * 从0-x范围之间的数 n 进行遍历，判断是否有n^2=x
     * 为了提高查询效率，我们可以选择二分法
     */
    public static int mySqrtTest1(int x) {
        if(x <= 1){
            return x;
        }
        int left = 1;
        int right = x;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid <= x / mid){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrtTest1(2147395599));
    }
}
