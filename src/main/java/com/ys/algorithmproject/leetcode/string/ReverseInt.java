package com.ys.algorithmproject.leetcode.string;

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。
//假设环境不允许存储 64 位整数（有符号或无符号）。

// https://leetcode.cn/problems/reverse-integer/
public class ReverseInt {


    /**
     * 解法1：转成字符数组，然后翻转，在求值
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int index = 0;
        int sign = 1;
        // 判断符号
        if(chars[index] == '-'){
            index++;
            sign = -1;
        }
        // 字符数组翻转
        int left = index,right = chars.length-1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        int res = 0,last=0;
        for (int i = index; i < chars.length; i++) {
            last = res;
            res = res*10+sign*(chars[i]-'0');
            // 处理溢出逻辑
            if(res/10 != last){
                return 0;
            }
        }

        return res;
    }

    /**
     * 解法2:直接取余%10,得到每个位上的值
     * @param x
     * @return
     */
    public static int reverse2(int x) {
        int res = 0,last = 0;
        while(x!=0){
            int tmp = x%10;
            x = x/10;
            last = res;
            res = res*10 + tmp;
            if(res/10 != last){
                return 0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int x = -1234567890;
        System.out.println(reverse2(x));
    }
}
