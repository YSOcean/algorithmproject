package com.ys.algorithmproject.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 传统的方法
 *
 * @author shuaiyu
 */
public class Tradition {
    /**
     * @Author: yuShuai
     * @Description:
     * @Date: 2019/4/10 13:48
     * @params: 筛选绿色苹果
     * @return:
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> greenAppleList = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++) {
            if("green".equals(inventory.get(i).getColor())){
                greenAppleList.add(inventory.get(i));
            }
        }
        return greenAppleList;
    }

    /**
     * @Author: yuShuai
     * @Description:
     * @Date: 2019/4/10 13:48
     * @params: 筛选重量大于150克的苹果
     * @return:
     */
    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }
}
