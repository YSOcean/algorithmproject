package com.ys.algorithmproject.leetcode.demo;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create by YSOcean
 * 语句是可以单独执行的、能够产生实际效果的代码；
 * 而表达式则是包含在语句中，根据某种条件计算出一个值或得出某种结果，然后由语句去判断和处理的代码。
 */
public class LambdaTest {



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


        List<Apple> greenApples = Tradition.filterGreenApples(appleList);
        List<Apple> heavyApples = Tradition.filterHeavyApples(appleList);
        List<Apple> stream = appleList.stream().filter((Apple a) -> a.getWeight()>150).collect(Collectors.toList());
        System.out.println("******");

        Predicate<Apple> redColor = x -> ("red").equals(x.getColor());
        Boolean flag = appleList.stream().anyMatch(redColor);

        Runnable r1 = () -> {System.out.println("abc");};
        r1.run();
        System.out.println("******");

        List<Apple> sortApples = appleList.stream().filter((a) -> a.getWeight()>150).collect(Collectors.toList());

        List<Integer> apples2 = appleList.stream().map(Apple::getWeight).collect(Collectors.toList());


        System.out.println("******");
        System.out.println("******");

    }
}
