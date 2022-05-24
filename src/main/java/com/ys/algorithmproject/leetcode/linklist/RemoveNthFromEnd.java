package com.ys.algorithmproject.leetcode.linklist;


// https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 0){
            return head;
        }
        // 比如加一个假的头节点，处理head.length = n 时，删除空指针异常
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast == null){
            slow.next = slow.next.next;
        }
        return dummy.next;
    }
}
