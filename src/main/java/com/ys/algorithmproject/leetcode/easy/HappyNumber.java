package com.ys.algorithmproject.leetcode.easy;

import javax.xml.transform.Result;
import java.util.HashSet;

/**
 * Create by YSOcean
 * 题目：快乐数字：从任意正整数开始，用数字的平方和替换数字，然后重复这个过程，
 * 直到数字等于1（在这里它将保持不变），或者在不包含1的循环中无限循环。
 * 这个过程以1结尾的数字是快乐数字
 * 例子：Input: 19  Output: true
 *      1^2 + 9^2 = 82
 *      8^2 + 2^2 = 68
 *      6^2 + 8^2 = 100
 *      1^2 + 0^2 + 02 = 1
 */
public class HappyNumber {
    /**
     * 循环过程中，只要出现以前出现的数字，那么肯定就不是快乐数
     * 这里用HashSet来存储每次出现的数，如果出现重复的，那么返回false
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            int result = 0;
            while(n != 0){
                result += Math.pow(n%10,2);
                n/=10;
            }
            if(set.contains(result)){
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;

    }
}
