package com.ys.algorithmproject.leetcode.demo.LinkedList;


import java.util.Arrays;

/**
 * Create by YSOcean
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedNode l1 = new LinkedNode("A");
        LinkedNode l2 = new LinkedNode("B");
        LinkedNode l3 = new LinkedNode("C");
        LinkedNode l4 = new LinkedNode("D");
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        print(l1);
        print(reverseList5(l1));

        Object[] array = {"ad",12,new LinkedNode("12")};
        System.out.println(Arrays.toString(array));
    }

    /**
     * @Author: yuShuai
     * @Description: 递归反转链表
     * @Date: 2019/10/22 10:23
     * @params:
     * @return:
     */
    public static LinkedNode reverseList4(LinkedNode head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedNode newLink = reverseList4(head.next);
        LinkedNode l2 = head.next;
        l2.next = head;
        head.next = null;

        return newLink;
    }


    /*******************************************************************************/

    /**
     * 递归反转链表
     * @param head
     * @return
     */
    public static LinkedNode reverseList1(LinkedNode head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedNode newList = reverseList1(head.next);
        LinkedNode l2 = head.next;
        l2.next = head;
        head.next = null;
        return newList;
    }

    /**
     * 反转链表2
     * @param head
     * @return
     */
    public static LinkedNode reverseList2(LinkedNode head){
        LinkedNode pre = null;
        LinkedNode current = null;
        while(head != null){
            current = head.next;
            head.next = pre;
            pre = head;
            head = current;
        }
        return pre;

    }


    /**
     * 反转链表3
     * @param head
     * @return
     */
    public static LinkedNode reverseList3(LinkedNode head){
        LinkedNode pre = null;
        LinkedNode current = head;

        while(head != null){
            current = head.next;
            head.next = pre;
            pre = head;
            head = current;
        }
        return pre;

    }



    /*************************************************************************************/

    /**
     * @Author: yuShuai
     * @Description: 递归
     * @Date: 2020/1/13 17:25
     * @params:
     * @return:
     */
    public static LinkedNode reverseList5(LinkedNode head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedNode newNode = reverseList5(head.next);
        LinkedNode l2 = head.next;
        l2.next = head;
        head.next=null;
        return newNode;
    }

    /**
     * @Author: yuShuai
     * @Description: 遍历
     * @Date: 2020/1/13 17:26
     * @params:
     * @return:
     */
    public static LinkedNode reverseLink6(LinkedNode head){
        LinkedNode pre = null;
        LinkedNode current = null;
        while(head != null){
            current = head.next;
            head.next = pre;
            pre = head;
            head = current;
        }
        return pre;
    }


    /**
     * 打印链表
     * @param head
     */
    public static void print(LinkedNode head){
        if(head == null){
            System.out.println("空链表！！！");
        }
        LinkedNode current = head;
        while(current != null){
            if(current.next == null){
                System.out.print(current.val+"->"+current.next);
                System.out.println();
            }else{
                System.out.print(current.val+"->");
            }
            current = current.next;
        }
    }
}
