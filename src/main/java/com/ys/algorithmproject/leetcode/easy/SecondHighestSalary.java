package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：根据下表查询第二高的薪水
 * +----+--------+
 | Id | Salary |
 +----+--------+
 | 1  | 100    |
 | 2  | 200    |
 | 3  | 300    |
 +----+--------+
 */
public class SecondHighestSalary {

    public static void main(String[] args) {
        //查询小于最大薪水的最大薪水
        /*
        SELECT max(Salary) as SecondHighestSalary
        FROM Employee
        WHERE Salary < (SELECT max(Salary) FROM Employee)
         */
    }
}
