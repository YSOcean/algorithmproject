package com.ys.algorithmproject.leetcode.demo.stream;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by YSOcean
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Dash> menu = Arrays.asList(
                new Dash("pork",false,800,Dash.Type.MEAT),
                new Dash("beef",false,700,Dash.Type.MEAT),
                new Dash("chicken",false,400,Dash.Type.MEAT),
                new Dash("french fries",true,530,Dash.Type.OTHER),
                new Dash("rice",true,350,Dash.Type.OTHER),
                new Dash("season",false,120,Dash.Type.OTHER),
                new Dash("pizza",true,550,Dash.Type.OTHER),
                new Dash("prawns",false,300,Dash.Type.FISH),
                new Dash("salmon",false,450,Dash.Type.FISH)
        );
        List<Dash> isVegetarian =
                menu.stream().filter( a -> a.isVegetarian()).collect(Collectors.toList());
        List<Dash> isVegetarian2 =
                menu.stream().filter(Dash::isVegetarian).collect(Collectors.toList());


        //筛选各异的元素distinct
        List<Integer> nums = Arrays.asList(1,2,1,3,3,2,4);
        nums.stream().filter(i -> i%2==0).distinct()
                .forEach(System.out::println);

        //截断流limit
        List<Dash> dishes = menu.stream().filter(d -> d.getCalories()>300)
                .limit(3).collect(Collectors.toList());

        //跳过元素
        List<Dash> dishSkip = menu.stream().filter(d -> d.getCalories()>300)
                .skip(2).collect(Collectors.toList());

        System.out.println("**********");
    }
}
