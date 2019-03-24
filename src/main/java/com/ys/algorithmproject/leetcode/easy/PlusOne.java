package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个非负整数的非空数字数组，拼起来成为一个整数，然后加1，
 *      得到一个新的整数，然后将每一位分开，返回新的数组
 * 注意：假定整数不包含任何前导0，除了数字0本身
 * 例子：[1,2,3]，返回[1,2,4]。因为给定123，加1，得到124，然后拆分成数组返回；
 *      [1,8,9],返回[1,9,0]。因为给定189，加1，得到190，然后拆分成数组返回。
 *
 * 分析：这里其实主要是要区分为9的时候，需要向前进位
 */
public class PlusOne {


    /**
     * 从数组末尾开始进行遍历数组，如果小于9，则直接数组末尾加1，然后返回该数组
     * 如果等于9，那么将该位置置为0
     * 最后，循环完整个数组，还没遇到小于9的数，其实也就是遇到全是9的数组。[9,9,9,9]
     * 那么构造一个新的数组，比原数组长度多1，然后新数组第一位值为1，其余都为0。[1,0,0,0,0]
     *
     */
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        int len = digits.length;
        for (int i = len-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[len+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
