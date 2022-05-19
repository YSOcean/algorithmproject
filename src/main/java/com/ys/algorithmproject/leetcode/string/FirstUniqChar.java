package com.ys.algorithmproject.leetcode.string;

import java.util.*;
//给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
//
//
//
// 示例 1：
//
//
//输入: s = "leetcode"
//输出: 0
//
//
// 示例 2:
//
//
//输入: s = "loveleetcode"
//输出: 2
//
//
// 示例 3:
//
//
//输入: s = "aabb"
//输出: -1
//
//
//
//
// 提示:
//
//
// 1 <= s.length <= 105
// s 只包含小写字母
//
// Related Topics 队列 哈希表 字符串 计数
// 👍 551 👎 0

//https://leetcode.cn/problems/first-unique-character-in-a-string/
public class FirstUniqChar {


    /**
     * 解法1：
     * 我们可以对字符串进行两次遍历。
     * 在第一次遍历时，我们使用哈希映射统计出字符串中每个字符出现的次数。
     * 在第二次遍历时，我们只要遍历到了一个只出现一次的字符，那么就返回它的索引，否则在遍历结束后返回 -1。
     * @param s
     * @return
     */
    public int firstUniqChar1(String s){
        if(s == null || s.length() == 0){
            return -1;
        }
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }
}
