package com.ys.algorithmproject.leetcode.linklist;

// https://leetcode.cn/problems/merge-two-sorted-lists/
public class MergeTwoLists {

    /**
     * 迭代
     * ①、构造一个新的链表
     * ②、依次比较原两个链表，小的放在新链表上
     * ③、比较完后，判断两个链表哪个还没遍历完，直接加到新链表末尾即可
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        // 构造一个空链表
        ListNode newNode = new ListNode();
        ListNode cur = newNode;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;
            }else{
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;

        }
        if(list1 != null){
            cur.next = list1;
        }
        if(list2 != null){
            cur.next = list2;
        }
        return newNode.next;
    }

    /**
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list1;
        }else if(list2 == null){
            return list2;
        }else if(list1.val < list2.val){
            list1.next = mergeTwoLists2(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists2(list1,list2.next);
            return list2;
        }
    }
}
