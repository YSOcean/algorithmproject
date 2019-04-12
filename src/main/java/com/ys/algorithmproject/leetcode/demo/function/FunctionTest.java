package com.ys.algorithmproject.leetcode.demo.function;

import com.ys.algorithmproject.leetcode.demo.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author shuaiyu
 */
public class FunctionTest {

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T s : list){
            result.add(f.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(100,"red"),
                new Apple(160,"red"),
                new Apple(170,"green"),
                new Apple(100,"green")
        );
        List<Integer> weightList = map(appleList,(a) -> a.getWeight());

        List<Integer> weightList2 = map(appleList,Apple::getWeight);

        System.out.println("***********");
    }

}
