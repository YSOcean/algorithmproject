package com.ys.algorithmproject.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by YSOcean
 * 题目：设计并实现一个twosum类，支持添加和查找方法。
 * 添加add：将数字添加到内部数据结构中
 * 查找find：是否存在任何一对数字等于该查找的数字
 * 例子：add(1); add(3); add(5);然后find(4) -> true;find(7) -> false
 */
public class TwoSumIIIDatastructuredesign {
    List<Integer> list = new ArrayList<>();

    public void add(int num){
        list.add(num);
    }

    public boolean find(int value){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {

        }
        return false;
    }
}
