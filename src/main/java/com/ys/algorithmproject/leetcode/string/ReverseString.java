package com.ys.algorithmproject.leetcode.string;

//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
//
// 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
//
//
//
// 示例 1：
//
//
//输入：s = ["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
//
//
// 示例 2：
//
//
//输入：s = ["H","a","n","n","a","h"]
//输出：["h","a","n","n","a","H"]
//
//
//
// 提示：
//
//
// 1 <= s.length <= 105
// s[i] 都是 ASCII 码表中的可打印字符
//
// Related Topics 递归 双指针 字符串
// 👍 594 👎 0

//https://leetcode.cn/problems/reverse-string/
public class ReverseString {

    /**
     * 解法1：双指针
     * @param s
     */
    public static void reverseString1(char[] s) {
        if(s == null || s.length == 0){
            return;
        }
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * 解法2：递归
     * @param s
     */
    char temp = 0;
    public void reverseString2(char[] s) {
        reverse(s, 0, s.length-1);

    }
    public void reverse(char[]s, int left, int right) {
        // 返回条件
        if (left>=right) {
            return;
        }
        // 递之前
        temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        // 递下去
        reverse(s, left+1, right-1);
    }


    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString1(s);
        System.out.println(s);
    }
}
