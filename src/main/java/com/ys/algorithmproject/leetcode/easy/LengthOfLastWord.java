package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 */
public class LengthOfLastWord {
    public int lengthOfLastWordTest1(String s) {
        s = s.trim();
        int lastIndexSpace = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndexSpace;
    }
}
