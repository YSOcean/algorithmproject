package com.ys.algorithmproject.leetcode.string;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
// Related Topics 字符串
// 👍 2248 👎 0

//
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null){
            throw new IllegalArgumentException("strs is null");
        }
        // 1、找出长度最小的字符串
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length() < strs[minIndex].length()){
                minIndex = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = strs[minIndex].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if(temp != strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            sb.append(temp);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }
}
