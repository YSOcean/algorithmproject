package com.ys.algorithmproject.leetcode.easy;

import java.util.Arrays;

/**
 * Create by YSOcean
 * 题目：给定一个字符串数组，查找最长的公共前缀，如果没有，则返回空字符串“”
 * 例子：["flower","flow","flight"]返回"fl"
 *       ["dog","racecar","car"]  返回""
 */
public class LongestCommonPrefix {

    /**
     * 暴力解法：通过两层循环遍历,取第一个字符串，进行第一层遍历，然后第二层循环遍历其余的字符串
     *          当第二层循环遍历到第一个字符串长度完毕，或者不等于第一个字符串某个字符，说明找到最大字符串
     *
     */
    public String longestCommonPrefixTest1(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return res.toString();
                }
            }
            res.append(c);
        }
        return res.toString();
    }


    /**
     * 暴力解法（优化1）：将字符串数组进行长度排序，从遍历最小的字符串长度开始
     *
     */
    public static String longestCommonPrefixTest3(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[j].substring(0, i);
                }
            }

        }
        return strs[0];
    }


    /**
     * 暴力解法（优化2）：将给定字符串进行排序，然后从最小长度的字符串进行遍历比较
     * 注意：这里其实是否比上面方法更好要看排序时间，如果数组不好排序，那么所需时间可能更长
     *
     */
    public static String longestCommonPrefixTest2(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[j].substring(0, i);
                }
            }

        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"12","12345","123"};
        Arrays.sort(strs);
        System.out.println(strs);
    }
}
