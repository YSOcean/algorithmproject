package com.ys.algorithmproject.leetcode.demo.consumer;

import com.ys.algorithmproject.leetcode.demo.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author shuaiyu
 */
public class ConsumerTest {

    public static <T> void forEach(List<T> t, Consumer<T> c){
        for(T i : t){
            c.accept(i);
        }
    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
        new Apple(100,"red"),
        new Apple(160,"red"),
        new Apple(170,"green"),
        new Apple(100,"green")
        );
        forEach(appleList,(Apple a) -> System.out.println(a.getWeight()));
    }
}
