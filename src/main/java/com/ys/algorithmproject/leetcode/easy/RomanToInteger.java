package com.ys.algorithmproject.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by YSOcean
 * 下面是罗马字母对应的数字：
 *      Symbol       Value
 *      I             1
 *      V             5
 *      X             10
 *      L             50
 *      C             100
 *      D             500
 *      M             1000
 *  由罗马字母组成数字有如下要求：
 *  1、相同的数字连写，所表示的数等于这些数字相加得到的数，如：Ⅲ = 3；
 *  2、小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12；
 *  3、小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9；
 *  4、正常使用时，连写的数字重复不得超过三次。（表盘上的四点钟“IIII”例外）
 *  5、在一个数的上面画一条横线，表示这个数扩大1000倍。
 *
 *  题目：给定一个罗马数字，将其转换为整数。输入保证在1到3999之间。
 */
public class RomanToInteger {


    /**
     * HashMap:构造出一个HashMap<罗马单个数字，阿拉伯数字>的集合。对于给定的一个罗马数字串，有如下特点：
     *     如果之后的数字比当前的小，或者当前数字是最后一个，那么都是相加；反之别的情况都是相减
     * 时间复杂度：O(str.length)
     * 空间复杂度：O(1)
     */
    public static int romanToIntTest1(String str){
        if(str == null || str.length()==0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = map.get(str.charAt(i));
            //当前是最后一个数字或者当前数字比之后的大
            if((i == (str.length()-1)) || map.get(str.charAt(i+1))<=temp){
                result += temp;
            }else{
                result -= temp;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToIntTest1("III"));
    }
}
