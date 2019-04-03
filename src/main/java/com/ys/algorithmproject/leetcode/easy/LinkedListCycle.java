package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：链表环的检测，给定一个链表，确定是否有环，可以用尾部节点连接的节点索引值（从0开始）来表示
 *       如果没有环，则索引值为0
 */
public class LinkedListCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }


    /**
     * 快慢指针：定义两个指针，一个慢指针一次走一个节点，另一个快指针一次走两个节点
     *          如果两个指针能够相遇，那么一定有环
     */
    public boolean hasCycleTest1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    /**
     *  遍历链表，然后将链表值赋值新的值，后面遇到等于该新值的节点时，即有环
     *  所以此方法的前提是判断链表初始值不含该新值。
     *  下面方法运行会超时Time Limit Exceeded
     */
    public boolean hasCycleTest2(ListNode head) {
       if(head == null || head.next == null){
           return false;
       }
       while(head != null){
           if(head.val == Integer.MAX_VALUE){
               head.val = 1;
           }
           head = head.next;
       }
       while(head != null){
           if(head.val != Integer.MAX_VALUE){
               head.val = Integer.MAX_VALUE;
               head = head.next;
           }else{
               return true;
           }
       }
        return false;
    }
}
