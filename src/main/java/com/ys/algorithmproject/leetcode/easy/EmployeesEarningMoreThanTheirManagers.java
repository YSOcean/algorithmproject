package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：查询下表下属比领导工资还高的人
 * +----+-------+--------+-----------+
 | Id | Name  | Salary | ManagerId |
 +----+-------+--------+-----------+
 | 1  | Joe   | 70000  | 3         |
 | 2  | Henry | 80000  | 4         |
 | 3  | Sam   | 60000  | NULL      |
 | 4  | Max   | 90000  | NULL      |
 +----+-------+--------+-----------+
 结果如下：
 +----------+
 | Employee |
 +----------+
 | Joe      |
 +----------+
 */
public class EmployeesEarningMoreThanTheirManagers {
    public static void main(String[] args) {
        //1、构造两张表，一张下属表，一张领导表，自关联
        /*
        select c.aName Employee from (
            select a.Name aName,a.Salary aSalary,b.Name bName,b.Salary bSalary
            from Employee a
            inner join Employee b
            on a.ManagerId = b.Id
        ) c
        where c.aSalary > c.bSalary
         */

        //2、将上面结构简化
        /*
        select a.Name Employee
        from Employee a
        inner join Employee b
        on a.ManagerId = b.Id
        where a.salary > b.salary
        */
    }
}
