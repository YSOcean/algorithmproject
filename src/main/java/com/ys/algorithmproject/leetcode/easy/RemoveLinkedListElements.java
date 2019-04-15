package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个值，移除链表中为该值的节点
 * 例子：Input:  1->2->6->3->4->5->6, val = 6
 *      Output: 1->2->3->4->5
 */
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements1(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head.val == val ? head.next:head;

    }


    /**
     * 构造一个头节点
     */
    public ListNode removeElements2(ListNode head, int val) {
        ListNode headNode = new ListNode(0);
        headNode.next = head;
        ListNode current = headNode;
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return headNode.next;

    }
}
