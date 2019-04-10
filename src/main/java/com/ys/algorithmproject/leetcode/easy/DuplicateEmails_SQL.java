package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：查询下表重复的电子邮件
 * +----+---------+
 | Id | Email   |
 +----+---------+
 | 1  | a@b.com |
 | 2  | c@d.com |
 | 3  | a@b.com |
 +----+---------+
 结果为：
 +---------+
 | Email   |
 +---------+
 | a@b.com |
 +---------+
 */
public class DuplicateEmails_SQL {
    public static void main(String[] args) {
        //根据Email分组查询，数量大于1的
        /*
        select Email
        from Person
        group by Email
        having count(Id)>1
         */
    }
}
