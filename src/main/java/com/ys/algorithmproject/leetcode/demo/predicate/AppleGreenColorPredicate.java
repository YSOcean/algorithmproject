package com.ys.algorithmproject.leetcode.demo.predicate;

import com.ys.algorithmproject.leetcode.demo.Apple;

/**
 * @author shuaiyu
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
