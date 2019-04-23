package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：反转链表
 * 例子：1->2->3->4->5->NULL  变为  5->4->3->2->1->NULL
 */
public class ReverseLinkedList {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    /**
     * 递归
     */
    public static ListNode reverseListTest1(ListNode node){
        if(node == null || node.next==null){
            return node;
        }
        ListNode tempNode = node.next;
        ListNode newHead = reverseListTest1(node.next);
        tempNode.next = node;
        node.next = null;
        return newHead;
    }


    /**
     * 遍历
     */
    public static ListNode reverseListTest2(ListNode head){
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode newHead = null;
        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            if(nextNode == null){
                newHead = currentNode;
            }
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return newHead;
    }

}
