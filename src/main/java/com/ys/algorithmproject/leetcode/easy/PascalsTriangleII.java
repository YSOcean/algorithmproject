package com.ys.algorithmproject.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by YSOcean
 * 题目：给定一个非负索引k，其中k≤33，返回pascal三角形的第k个索引行。
 * 注意：请注意，行索引从0开始。
 */
public class PascalsTriangleII {

    /**
     * 求出pascal三角形的每一行，然后返回最后一行
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++) {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            allrows.add(new ArrayList<>(row));
        }
        return allrows.get(rowIndex);

    }
}
