package com.ys.algorithmproject.leetcode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Create by YSOcean
 * 题目：给定二叉树，返回其节点值的自下而上的顺序遍历。（即从左到右，从叶到根逐级排列）。
 * 例子：   3
 *         / \
 *        9  20
 *          /  \
 *         15   7
 *  返回结果为：[
 *                  [15,7],
 *                  [9,20],
 *                  [3]
 *              ]
 */
public class BinaryTreeLevelOrderTraversalII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * DFS
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
    }
}
