package com.ys.algorithmproject.leetcode.array;

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
// https://leetcode.cn/problems/plus-one/
public class PlusOne {

    /**
     * 解法一：会有溢出异常
     * ①、先算出数组的和；
     * ②、和+1
     * ③、将结果转成字符串，在转成字符数组
     * ④、字符数组在转成 int 数组
     * 其中第①、②步会有溢出异常。
     * @param digits
     * @return
     */
    public static int[] plusOne1(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result*10+digits[i];
            System.out.println(result);
        }
        char[] chars = String.valueOf(result).toCharArray();
        int[] newDigits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newDigits[i] = chars[i]-'0';
        }
        return newDigits;
    }

    public static int[] plusOne2(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }



    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        plusOne2(digits);
        int result = 987654321;
        System.out.println(Integer.MAX_VALUE);
    }
}
