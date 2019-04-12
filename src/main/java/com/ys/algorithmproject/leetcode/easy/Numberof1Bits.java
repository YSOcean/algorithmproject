package com.ys.algorithmproject.leetcode.easy;

import java.util.Arrays;

/**
 * Create by YSOcean
 * 题目：返回一个无符号整数转换成bit后，1的个数（汉明权重）
 * 例子：Input：00000000000000000000000000001011  Output: 3
 *      Input: 11111111111111111111111111111101  Output: 31
 */
public class Numberof1Bits {

    /**
     * 将整数转换成二进制字符串，然后将字符串转换成字符数组，然后遍历该数组，等于1便计数
     * 最后输出计数的结果
     */
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        char[] chars = str.toCharArray();
        int count = 0;
        for(char c : chars){
            if('1' == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Character[] characters = new Character[]{'1','0','1','1'};
        long l = Arrays.stream(characters).filter((c) -> c.equals('0')).count();
        System.out.println(l);
    }
}
