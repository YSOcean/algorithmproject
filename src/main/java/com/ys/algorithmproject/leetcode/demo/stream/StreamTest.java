package com.ys.algorithmproject.leetcode.demo.stream;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
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

        /***************筛选和切片*****************/

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


        //筛选两个荤菜
        List<Dash> dashNoVegatarinList = menu.stream().filter(d -> !d.isVegetarian())
                .limit(2).collect(Collectors.toList());


        /******************映射****************************/

        //提取每个单词的长度
        List<String> stringList = Arrays.asList("Java8","Lambdas","in","Action");
        List<Integer> stringLength = stringList.stream().map((str) -> str.length())
                .collect(Collectors.toList());

        //提取单词组中每个不同的字符
        //错误做法
        List<String[]> s = stringList.stream().map((str) -> str.split("")).distinct()
                .collect(Collectors.toList());

        //正确做法 flatMap
        List<String> st = stringList.stream().map(w -> w.split(""))
                .flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        //给定一个数组列表，返回每个元素平方的列表
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Integer> sqrIntList = intList.stream().map(i->i*i)
                .collect(Collectors.toList());



        /******************查找和匹配****************************/
        if(menu.stream().anyMatch(Dash::isVegetarian)){
            System.out.println("存在素食");
        }

        /******************归约****************************/
        int[] nums2 = {1,2,3,4,5};
        //对数组中元素求和
        int sum1 = Arrays.stream(nums2).reduce(0,(x,y)->x+y);
        int sum2 = Arrays.stream(nums2).reduce(0,Integer::sum);


        //求数组中最大元素
        OptionalInt maxNum1 = Arrays.stream(nums2).reduce((x,y)->x>y?x:y);
        OptionalInt maxNum2 = Arrays.stream(nums2).reduce(Integer::max);

        //统计菜单中有多少个菜
        int menuNum1 = menu.stream().map(d->1).reduce(0,Integer::sum);
        Long menuNum2 = menu.stream().count();

        Long lo = menu.stream().collect(Collectors.counting());


        //连接字符串
        String menuStr1 = menu.stream().map(Dash::getName).collect(Collectors.joining());
        String menuStr2 = menu.stream().map(Dash::getName).collect(Collectors.joining(","));

        //分组
        Map<Dash.Type,List<Dash>> typeListMap = menu.stream().
                collect(Collectors.groupingBy(Dash::getType));
        System.out.println("**********");
    }
}
