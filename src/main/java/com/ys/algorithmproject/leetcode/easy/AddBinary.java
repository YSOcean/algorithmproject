package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定两个二进制字符串，返回他们的和(也是一个二进制字符串)
 * 注意：输入字符串都是非空的，并且只包含0或1
 * 例子：a = "11", b = "1"，返回"100"
 */
public class AddBinary {

    /**
     *  遍历两个字符串，依次相加
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aPoint = a.length() - 1;
        int bPoint = b.length() - 1;
        //表示进位
        int carry = 0;
        int count = 0;
        while(aPoint >= 0 || bPoint >= 0){
            if(aPoint >= 0){
                if(a.charAt(aPoint) == '1'){
                    count++;
                }
            }
            if(bPoint >= 0){
                if(b.charAt(bPoint) == '1'){
                    count++;
                }
            }
            if(carry == 1){
                count++;
            }
            carry = (count > 1 ? 1:0);
            sb.insert(0,((count == 0 || count == 2)? '0' : '1'));
            count = 0;
            aPoint--;
            bPoint--;
        }
        if(carry == 1){
            sb.insert(0,'1');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.insert(0,'1');
        System.out.println(sb.toString());

    }
}
