package com.ys.algorithmproject.leetcode.linklist;

import com.ys.algorithmproject.leetcode.demo.LinkedList.LinkedNode;

import java.util.*;

public class MyLinkListTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,null);
        ListNode l2 = new ListNode(2,l1);
        ListNode l3 = new ListNode(3,l2);
        ListNode l4 = new ListNode(1,l3);
        ListNode l5 = new ListNode(2,l4);
        ListNode l6 = new ListNode(3,l5);
        removeDuplicateNodes(l6);

    }
    public ListNode reverseList1(ListNode head) {
        if(head != null || head.next==null){
            return head;
        }
        ListNode newNode = reverseList1(head.next);
        ListNode l2 = head.next;
        l2.next = head;
        head.next = null;
        return newNode;
    }
    public boolean isPalindrome1(ListNode head) {
        //寻找中间节点
        ListNode slow = head;
        ListNode fast = head;
        if(fast != null && fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //翻转中间节点之后的链表
        ListNode rightLink = reverseLink(slow.next);
        //比较两个链表是否相等
        ListNode l1 = head;
        ListNode l2 = rightLink;
        while(l2!=null){
            if(l1.val != l2.val){
                return false;
            }
        }
        return true;
    }
    public ListNode reverseLink(ListNode node){
        if(node==null || node.next == null){
            return node;
        }
        ListNode linkedNode = reverseLink(node.next);
        ListNode l2 = node.next;
        l2.next=node;
        node.next = null;
        return linkedNode;
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode current = head;
        Set<Integer> set = new HashSet<>();
        while (current != null && current.next != null){
            set.add(current.val);
            if(set.contains(current.next.val)){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    public static int[] reversePrint(ListNode head) {
        if(head == null){
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int stackSize = stack.size();
        int[] resultArray = new int[stackSize];
        for (int i = 0; i < stackSize; i++) {
            resultArray[i] = stack.pop();
        }
        return resultArray;
    }
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        boolean zeroFlag = true;
        while(head != null){
            if(head.val==1 && zeroFlag){
                list.clear();
                zeroFlag = false;
            }
            list.add(head.val);
            head = head.next;
        }
        int result = 0,j=0;
        for (int i = list.size()-1; i >=0 ; i--) {
            result+=list.get(i)*Math.pow(2,j++);
        }
        return result;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            if(fast.next.next==null){
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size()-1;
        while(left<=right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode nextNode = reverseList(head.next);
        ListNode t2 = head.next;
        t2.next=head;
        head.next=null;
        return nextNode;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinelNode = new ListNode();
        sentinelNode.next = head;
        ListNode prev = sentinelNode;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return sentinelNode.next;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode current = headA;
        while(current != null){
            ListNode temp = headB;
            while(temp != null){
                if(current == temp){
                    return current;
                }
                temp = temp.next;
            }
            current = current.next;
        }
        return null;
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast ==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        while(current.next != null){
            ListNode nextNode = current.next;
            if(current.val == nextNode.val){
                current.next=nextNode.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        else if(l1.val>l2.val){
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }else{
            l1.next=mergeTwoLists(l2,l1.next);
            return l1;
        }
    }



}
