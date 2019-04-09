package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：根据两张表查询信息
 * Table: Person
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | PersonId    | int     |
 | FirstName   | varchar |
 | LastName    | varchar |
 +-------------+---------+

 Table: Address
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | AddressId   | int     |
 | PersonId    | int     |
 | City        | varchar |
 | State       | varchar |
 +-------------+---------+

 查询如下信息：FirstName, LastName, City, State
 */
public class CombineTwoTables {
    public static void main(String[] args) {
        //左连接
        /*
        select p.FirstName,p.LastName,a.City,a.State
        from Person p
        left join Address a
        on p.PersonId = a.PersonId
        */
    }
}
