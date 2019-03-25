package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：比较两个二叉树是否完全一致（节点相同，值相同）
 */
public class SameTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    /**
     * 利用深度优先搜索DFS来递归
     */
    public boolean isSameTreeTest1(TreeNode p, TreeNode q) {
        if(p == null && q==null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return isSameTreeTest1(p.left,q.left) && isSameTreeTest1(p.right,q.right);
        }
        return false;
    }
}

