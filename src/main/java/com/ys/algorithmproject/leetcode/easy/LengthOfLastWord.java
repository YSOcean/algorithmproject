package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：一个字符串只由大写、小写字母以及空格组成，求最后一个单词的长度
 * 注意：如果最后一个词不存在，则返回0
 */
public class LengthOfLastWord {

    /**
     * 首先去掉给定字符串首尾的空格，然后得到新字符串最后一个空格的位置
     * 最后用整个字符串的长度减去最后一个空格位置的索引即所求。
     */
    public int lengthOfLastWordTest1(String s) {
        if(s == null || (s=s.trim()).equals("")){
            return 0;
        }
        int lastIndexSpace = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndexSpace;
    }
}
