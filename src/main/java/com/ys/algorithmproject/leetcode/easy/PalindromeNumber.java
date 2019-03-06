package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定数据，判断是否是回文数（整数从前到后读以及从后到前读是一样的）
 * 例子：121是回文数，123不是，-121不是，10不是
 */
public class PalindromeNumber {

    /**
     * 反转比较：将给定整数反转，然后进行比较
     * 时间复杂度：O(logx)
     * 空间复杂度：O(1)
     */
    public static boolean isPalindromeNumberTest1(int x){
        if(x<0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int tempX = x;
        long temp = 0L;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            //注意-2147483648<=Integer<=2147483647正数最后一位是7，负数最后一位是8，需要进行溢出判断
            //如果溢出肯定是false
            if(temp >Integer.MAX_VALUE/10 || (temp==Integer.MAX_VALUE/10 && pop > 7)){
                return false;
            }
            if(temp <Integer.MIN_VALUE/10 || (temp==Integer.MIN_VALUE/10 && pop < -8)){
                return false;
            }
            temp = temp*10+pop;
        }
        if(temp == tempX){
            return true;
        }
        return false;
    }


    /**
     * 反转比较：将给定整数反转，然后进行比较
     * 时间复杂度：O(logx)
     * 空间复杂度：O(1)
     */
    public static boolean isPalindromeNumberTest2(int x){
        int v;
        //1.负数必定不是回文数
        if(x<0) return false;
        //2.个位数必定是回文数
        if(x < 10) return true;
        //3.模上10余数为0，且x不为0(这个条件前面判断了，因为0<10,是回文数)
        if(x%10==0) return false;
        //4.10<x<100 之间，也就是两位数能够整除11的都是回文数（字面意思就是两个数相同）
        if(x<100&&x%11==0) return true;
        //5.100<x<1000之间，三位数，取百位数和个位数组成的数，如果能够整除11，那么就是回文数
        if(x<1000&&((x/100)*10+x%10)%11==0) return true;


        //6.每次通过除以10和对10取余来保存下前半部分x和后半部分v
        //当前半部分x<后半部分v时，停止循环
        //然后比较前半部分跟后半部分，相等则是回文数
        v = x%10;
        x = x/10;
        while(x-v>0){
            v = v*10+x%10;
            x/=10;
        }

        if(v>x){
            v/=10;
        }
        return v==x?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumberTest1(1));
    }
}
