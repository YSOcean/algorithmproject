package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：查找两个单独链表开始相交的节点
 * 注意：1、如果两个链接列表完全没有交集，则返回空值。
 *       2、函数返回后，链接列表必须保留其原始结构。
 *       3、可以假设整个链接结构中没有环。
 *       4、代码最好在O（n）时间内运行，并且只使用O（1）内存。
 */
public class IntersectionofTwoLinkedLists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }
}
