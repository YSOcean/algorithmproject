package com.ys.algorithmproject.leetcode.easy;

import java.util.Stack;

/**
 * Create by YSOcean
 * 题目：自定义一个栈，然后具有如下方法
 * push(x) -- 将元素x压入栈中
 * pop() -- 移除栈顶的元素
 * top() -- 得到栈顶的元素
 * getMin() -- 返回栈中最小的元素
 */
public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        if(x <= min){
            min = x;
            stack.push(min);
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
