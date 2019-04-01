package com.ys.algorithmproject.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by YSOcean
 * 题目：给定一个非负整数numRows，生成pascal三角形的前numRows
 * 注意：pascal三角形,每一行的首个和末尾都是1，从第三行开始，中间每个数字都是上一行左右两个数字之和
 */
public class PascalsTriangle {

    /**
     * 根据pascal三角形的生成规则
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            allrows.add(new ArrayList<>(row));
        }
        return allrows;
    }
}
