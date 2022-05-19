package com.ys.algorithmproject.leetcode.string;

//实现 strStr() 函数。
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。
//
// 说明：
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
//
//
//
// 示例 1：
//
//
//输入：haystack = "hello", needle = "ll"
//输出：2
//
//
// 示例 2：
//
//
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
//
//
//
//
// 提示：
//
//
// 1 <= haystack.length, needle.length <= 104
// haystack 和 needle 仅由小写英文字符组成
//
// Related Topics 双指针 字符串 字符串匹配
// 👍 1428 👎 0

//https://leetcode.cn/problems/implement-strstr/
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle==null){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        int index = 0;
        while(index <= (haystack.length()-needle.length())){
            if(haystack.substring(index,index+needle.length()).equals(needle)){
                return index;
            }else{
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "ffasda";
        String str2 = "asd";
        int i = strStr(str1,str2);
        System.out.println(i);
    }
}
