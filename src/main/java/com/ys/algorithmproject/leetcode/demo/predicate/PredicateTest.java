package com.ys.algorithmproject.leetcode.demo.predicate;

import com.ys.algorithmproject.leetcode.demo.Apple;
import com.ys.algorithmproject.leetcode.demo.Tradition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaiyu
 */
public class PredicateTest {

    public static List<Apple> filterApple(List<Apple> inventory , ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        Apple a1 = new Apple(100,"red");
        Apple a2 = new Apple(160,"red");
        Apple a3 = new Apple(170,"green");
        Apple a4 = new Apple(100,"green");
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        appleList.add(a4);

        ApplePredicate p = new AppleGreenColorPredicate();

        List<Apple> greenApples = filterApple(appleList,p);
        System.out.println("**********");


        List<Apple> heavyApples = filterApple(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>150;
            }
        });
        System.out.println("**********");
        List<Apple> result = filterApple(appleList,(Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("**********");
    }
}
