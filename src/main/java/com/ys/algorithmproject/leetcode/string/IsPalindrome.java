package com.ys.algorithmproject.leetcode.string;
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。
//
//
//
// 示例 1:
//
//
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
//
//
// 示例 2:
//
//
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 2 * 105
// 字符串 s 由 ASCII 字符组成
//
// Related Topics 双指针 字符串
// 👍 529 👎 0

//https://leetcode.cn/problems/valid-palindrome/
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0 ;
        int right = chars.length-1;
        while(left < right){
            char a = chars[left];
            char b = chars[right];
            if(!((a>='0'&&a<='9')||(a>='a'&&a<='z'))){
                left++;
                continue;
            }
            if(!((b>='0'&&b<='9')||(b>='a'&&b<='z'))){
                right--;
                continue;
            }
            if(a != b){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        isPalindrome(str);
    }
}
