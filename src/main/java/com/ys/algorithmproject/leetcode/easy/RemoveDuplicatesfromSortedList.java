package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个已排序的链表，删除重复的元素，使得每个元素只出现一次
 * 例子：给定1->1->2，删除后变为1->2
 */
public class RemoveDuplicatesfromSortedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    /**
     *  遍历整个链表，依次将当前链表值和下个节点的链表值进行比较
     */
    public ListNode deleteDuplicatesTest1(ListNode head) {
/*        if(head == null || head.next == null){
            return head;
        }*/
        ListNode currentNode = head;
        while(currentNode != null){
            if(currentNode.next == null){
                break;
            }
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }


    /**
     *  递归：递归三要素
     *  1、假设该函数deleteDuplicatesTest2(LinkedNode head)是用来求没有重复的链表
     *  2、结束条件：当节点为null或者节点.next为null时，直接返回
     *  3、递归函数：比较当前节点值是否和下一个节点的值相等，然后移动相应的指针
     */
    public ListNode deleteDuplicatesTest2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicatesTest2(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
