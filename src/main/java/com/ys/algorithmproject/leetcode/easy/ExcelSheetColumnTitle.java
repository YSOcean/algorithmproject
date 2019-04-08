package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个正整数，返回其在Excel工作表中显示的相应列标题。
 * 例子：1->A;2->B;26->Z;27->AA;28->AB
 */
public class ExcelSheetColumnTitle {
    /**
     * 从低位往高位求，每进一位，则把原数缩小26倍，再对26取余，之后减去余数，再缩小26倍，
     * 以此类推，可以求出各个位置上的字母。最后只需将整个字符串翻转一下即可（始终插入到第一位便不用翻转）。
     */
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }

}
