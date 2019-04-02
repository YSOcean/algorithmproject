package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个字符串，判断其是否是回文数
 * 注意：只考虑字母、数字，忽略大小写，这里空格判断是回文数
 * 例子："A man, a plan, a canal: Panama"这是回文数；"race a car"不是回文数
 */
public class ValidPalindrome {

    /**
     * 去掉所有非字母跟数字的字符，然后将该字符反转，在与原字符比较
     */
    public boolean isPalindromeTest1(String s) {
        if(s == null){
            return false;
        }
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }

    /**
     * 从头跟尾开始遍历该字符串，然后依次进行比较
     */
    public boolean isPalindromeTest2(String s) {
        if(s == null){
            return false;
        }
        int head = 0;
        int tail = s.length() - 1;
        char cHead,cTail;
        while(head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead)){
                head++;
            }else if(!Character.isLetterOrDigit(cTail)){
                tail--;
            }else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
