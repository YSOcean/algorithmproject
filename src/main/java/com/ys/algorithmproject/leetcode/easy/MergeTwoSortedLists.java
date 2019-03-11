package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：合并两个有序链表
 * 例子：1->2->4, 1->3->4这两个链表合并为：1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val = x;
        }
    }

    /**
     * 构造一个新的链表：创建一个新的链表，然后比较两个链表的大小，从小到大依次添加到新的链表中，
     *      最后比较完成，如果还有未到达末尾的链表，直接将该链表添加到新链表末尾即可。
     */
    public static ListNode mergeTwoListsTest1(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode newNode = new ListNode(-1);
        ListNode currentNode = newNode;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                currentNode.next = l2;
                l2 = l2.next;
            }else{
                currentNode.next = l1;
                l1 = l1.next;
            }
            currentNode = currentNode.next;
        }
        if(l1 != null){
            currentNode.next = l1;
        }
        if(l2 != null){
            currentNode.next = l2;
        }

        return newNode.next;
    }


    /**
     * 递归法：
     */
    public static ListNode mergeTwoListsTest2(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoListsTest2(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoListsTest2(l1, l2.next);
            return  l2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();

        ListNode node2 = new ListNode(0);

        mergeTwoListsTest1(node1,node2);
    }
}
