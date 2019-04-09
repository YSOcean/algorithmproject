package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：如果列标题出现在Excel工作表中，则返回相应的列号。
 * 例子：A -> 1;AA -> 27
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int result  = 0;
        for (int i = 0; i < s.length(); i++){
            result *= 26;
            result += ((s.charAt(i) - 'A') + 1);
        }
        return result;
    }
}
