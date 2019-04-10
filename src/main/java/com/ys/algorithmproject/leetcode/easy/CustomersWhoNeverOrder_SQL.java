package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：查询没有订单的客户名称
 客户表：Customers
 * +----+-------+
 | Id | Name  |
 +----+-------+
 | 1  | Joe   |
 | 2  | Henry |
 | 3  | Sam   |
 | 4  | Max   |
 +----+-------+
 订单表：Orders
 +----+------------+
 | Id | CustomerId |
 +----+------------+
 | 1  | 3          |
 | 2  | 1          |
 +----+------------+
 结果：
 +-----------+
 | Customers |
 +-----------+
 | Henry     |
 | Max       |
 +-----------+
 */
public class CustomersWhoNeverOrder_SQL {
    public static void main(String[] args) {
        //查询所有有订单的客户，构造一张字表，然后在查不在这张子表的客户
        /*
        select Name Customers
        from Customers
        where Id not in(
            select c.Id
            from Customers c
            right join Orders o
            on c.Id = o.CustomerId
        )
         */

        //查询有订单客户，但是订单表的CustomerId==null
        /*
        select c.Name Customers
        from Customers c
        left join Orders o
        on c.Id = o.CustomerId
        where o.CustomerId is null
         */
    }
}
