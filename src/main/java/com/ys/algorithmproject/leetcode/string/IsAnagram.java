package com.ys.algorithmproject.leetcode.string;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
//
//
//
// 示例 1:
//
//
//输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
//
//输入: s = "rat", t = "car"
//输出: false
//
//
//
// 提示:
//
//
// 1 <= s.length, t.length <= 5 * 104
// s 和 t 仅包含小写字母
//
//
//
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 哈希表 字符串 排序
// 👍 585 👎 0

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//https://leetcode.cn/problems/valid-anagram/
public class IsAnagram {

    /**
     * 解法1：构造两个 hashmap ,key 是字符，value 是字符出现的次数，然后遍历比较即可。
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for(Character c : charS){
            if(mapS.containsKey(c)){
                mapS.put(c,mapS.get(c)+1);
            }else{
                mapS.put(c,1);
            }
        }
        for(Character c : charT){
            if(mapT.containsKey(c)){
                mapT.put(c,mapT.get(c)+1);
            }else{
                mapT.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = mapS.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            // 注意，这里是包装类型的比较，会有缓存，所以不能直接用 mapT.get(key) != value
            if(value!=null && value.equals(mapT.get(key))){
                return false;
            }
        }
        return true;
    }


    /**
     * 解法2：
     * ①、因为字母设定是小写，那么总共只有26个，声明一个长度为26的整型数组，
     *    所以可以假定，数组下标0，表示字母'a'，数字下标1，表示字母'b'
     * ②、遍历第一个字符串，字符-'a'得到的结果一定是整型0-25，数组的值就表示字符出现的次数
     * ③、得到第一个字符串遍历后的数组，在遍历第二个字符串，将值出现一次，就减去1
     * ④、判断最后的数组是不是每个都是0，全都是0，则返回true，否则返回false
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        if(s == null || t == null || s.length()!=t.length()){
            return false;
        }
        int[] intArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            intArray[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            intArray[t.charAt(i)-'a']--;
        }
        for(int i : intArray){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
