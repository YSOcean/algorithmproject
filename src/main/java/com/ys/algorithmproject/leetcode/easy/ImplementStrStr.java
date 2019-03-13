package com.ys.algorithmproject.leetcode.easy;


/**
 * Create by YSOcean
 * 题目：给两个字符串，找出第二个字符串在第一个字符串中第一次出现的索引位置，如果找不到，返回-1，如果子字符串为空""，返回0
 * 例子："hello"和"ll"返回2
 */
public class ImplementStrStr {

    /**
     * 遍历母字符串，依次找到是否和字符串相等的地方，注意，不需要遍历完成整个母字符串。
     */
    public int strStrTest1(String haystack, String needle) {
        if(haystack == null || needle == null){
            return -1;
        }
        if(needle.length()==0 || haystack.equals(needle)){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        for (int i = 0; i <= haystack.length()-needle.length() ; i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }


}
