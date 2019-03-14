package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：读数，给定一个整数，根据如下规则输出读数字符串。
 * 规则：1.     1
 *       2.     11
 *       3.     21
 *       4.     1211
 *       5.     111221
 * 给个1，输出1；给个2，读取上面1输出的数，1个1，输出11；
 * 给个2，读取上面的数1，读作1个1，输出11
 * 给个3，读取上面的数11，读作2个1，输出21；
 * 给个4，读取上面的数21，读作1个2,1个1，输出1211；
 * 给个5，读取上面的数1211，读作1个1,1个2,2个1，输出111221
 * 给个6，读取上面的数111221，读作3个1,2个2,1个1，输出312211
 * 依次类推
 */
public class CountAndSay {

    /**
     * 解题思路：从左到右遍历该数，找出该数相同元素的个数，然后放到新的字符串中输出即可。
     */
    public String countAndSayTest1(int n) {
        if(n <= 0){
            return "";
        }
        String res = "1";
        while(--n > 0){
            char same = res.charAt(0);
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.length(); i++) {
                if(res.charAt(i) == same){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(same);
                    same = res.charAt(i);
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(same);
            res = sb.toString();
        }
        return res;
    }
}
