package com.ys.algorithmproject.leetcode.linklist;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/linked-list-cycle/
// 环形链表
public class HasCycle {


    /**
     * 快慢指针：快指针每次走两步，慢指针每次走一步，两者相遇，则一定有环
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && slow.next != null && fast != null && fast.next != null && fast.next.next != null) {
            if (slow.next == fast.next.next) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    /**
     * 集合去重判断：将每个节点放入HashSet 集合，放之前判断是否和之前的相等，如果存在相等的，则一定有环.
     * 注意：题目对节点数量有限制，所以可以这样做，如果是无限的没有环，则会超时
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
