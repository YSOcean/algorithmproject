package com.ys.algorithmproject.leetcode.easy;

import java.util.Stack;

/**
 * Create by YSOcean
 * 题目：给定一个仅包含字符'（'、'）'、'{'、'}'、'['和']'的字符串，确定输入字符串是否有效。
 * 有效性判断：
 *      1、开括号必须是同一类型的闭括号闭合
 *      2、开闭括号必须按照正确顺序
 * 注意：
 */
public class ValidParentheses {


    /**
     * 栈:利用栈先进后出的原则，遍历字符串，遇到左边符号“{[(”则压进栈，遇到右边符号“}])”则弹出栈顶的一个符号，
     *    通过这两个符号判断是否匹配，如果不匹配返回false；如果匹配，直接走完整个循环，最后判断栈是否是空栈，如果不是，
     *    说明还有符号未匹配成功，返回false
     */
    public boolean isValidTest1(String s) {
        if(s == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tempC = s.charAt(i);
            if(tempC == '(' || tempC == '{' || tempC == '['){
                stack.push(s.charAt(i));
            }
            if(stack.empty() || (tempC == ')' && stack.pop() != '(')||
                    (tempC == '}' && stack.pop() != '{')||
                    (tempC == ']' && stack.pop() != '[')){
                return false;
            }

        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(str.length());
        System.out.println(str.equals(""));
    }
}
