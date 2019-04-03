package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：这里有一个API，read4(char[] buf)
 *       指的是读取4个数，存储在buf中，然后返回成功读取的数目，如果不够四个，那么就返回剩余数目的字符。
 *       现在要实现这样一个函数read(char[] buf, int n)，n表示能够读取字符的数目
 */
/*public class ReadNCharactersGivenRead4 extends Reader4{

    public int read(char[] buf, int n) {
        int count = 0;
        char[] mybuf = new char[4];
        while(count<n){
            int num = read4(mybuf);
            if(num == 0) break;
            int index = 0;
            while(index < num && count<n){
                buf[count++] = mybuf[index++];
            }
        }
        return count;
    }
}*/
