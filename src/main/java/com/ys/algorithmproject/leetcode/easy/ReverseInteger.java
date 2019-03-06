package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个32位的integer数据，然后反转这个数
 * 例子：123变为321，-123变为-321，120变为21
 * 要求：1.当前环境最大只能存储32位数据
 *       2.当给定数据反转超过32位溢出时，返回0
 */
public class ReverseInteger {

    /**
     * 普通解法：将给定整数转换成字符数组，然后反转这个数组的元素，注意正负以及Integer的边界值
     * 时间复杂度：O(1)
     * 空间复杂度：O(1)
     */
    public static int reverseTest1(int x){
        //这里要将int转换成long求绝对值，因为Math.abs(-2147483648)=-2147483648
        //-2147483648<=Integer<=2147483647
        long absX = Math.abs((long) x);
        char[] charArray = Long.toString(absX).toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            char last = charArray[charArray.length-1-i];
            charArray[charArray.length-1-i] = charArray[i];
            charArray[i] = last;
        }
        long temp = Long.parseLong(new String(charArray));
        if(temp>=Integer.MAX_VALUE||temp<=Integer.MIN_VALUE){
            return 0;
        }
        return x>0?(int)temp:-(int)temp;
    }

    /**
     * 求模以及取商：将给定的整数不断整除10
     * 时间复杂度：O(logx)
     * 空间复杂度：O(1)
     */
    public static int reverseTest2(int x){
        long temp = 0L;
        while(x!=0){
            temp = temp*10+x%10;
            x = x/10;
        }
        if(temp>=Integer.MAX_VALUE||temp<=Integer.MIN_VALUE){
            return 0;
        }
        return (int)temp;
    }


    /**
     * 求模以及取商：和上面方法一样，不过这里没有用超过32位的Long类型变量，这也是官方推荐答案。
     * 时间复杂度：O(logx)
     * 空间复杂度：O(1)
     */
    public static int reverseTest3(int x){
        int temp = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            //注意-2147483648<=Integer<=2147483647正数最后一位是7，负数最后一位是8，需要进行判断，防止溢出
            if(temp >Integer.MAX_VALUE/10 || (temp==Integer.MAX_VALUE/10 && pop > 7)){
                return 0;
            }
            if(temp <Integer.MIN_VALUE/10 || (temp==Integer.MIN_VALUE/10 && pop < -8)){
                return 0;
            }
            temp = temp*10+pop;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt(new String(new char[]{'0','0','3'})));
        System.out.println(Math.abs(-123));
        System.out.println(Math.abs(-2147483648));
        System.out.println(reverseTest1(-2147483648));
    }
}
