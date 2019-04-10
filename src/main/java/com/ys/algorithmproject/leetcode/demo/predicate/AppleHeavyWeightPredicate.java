package com.ys.algorithmproject.leetcode.demo.predicate;

import com.ys.algorithmproject.leetcode.demo.Apple;

/**
 * @author shuaiyu
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >150;
    }
}
