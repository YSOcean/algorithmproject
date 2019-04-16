package com.ys.algorithmproject.leetcode.easy;

import java.util.HashMap;

/**
 * Create by YSOcean
 * 题目：同构字符串，给定两个字符串，一个字符串的每个字符都可以用来唯一替换另一个字符串的字符
 *      那么，这两个字符串就是同构的
 * 例子：Input: s = "egg", t = "add"  Output: true
 *      Input: s = "foo", t = "bar" Output: false
 *      Input: s = "paper", t = "title"  Output: true
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1){
            return true;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }else{
                if(!map.containsValue(b))
                    map.put(a,b);
                else return false;

            }
        }
        return true;
    }
}
