package com.ys.algorithmproject.leetcode.linklist;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/palindrome-linked-list/
// 回文链表
public class IsPalindrome {

    /**
     * 快慢指针：
     * ①、通过快慢指针，快指针每次走两步，慢指针每次走一步，快指针为null时，慢指针正好走到中间
     * ②、将中间节点到链表最后，进行翻转
     * ③、从头节点和翻转之后的节点进行遍历比较
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // 通过快慢指针找到中间节点,慢节点就是中间节点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverse(slow.next);
        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }


    /**
     * @param head
     * @return
     */
    public boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(0) != list.get(list.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
