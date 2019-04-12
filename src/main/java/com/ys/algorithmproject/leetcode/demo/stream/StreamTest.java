package com.ys.algorithmproject.leetcode.demo.stream;

import java.util.Arrays;
import java.util.List;

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


    }
}
