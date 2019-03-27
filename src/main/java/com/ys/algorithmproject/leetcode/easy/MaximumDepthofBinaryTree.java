package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个二叉树，求该树的最大深度
 * 注意：最大深度是从根节点到最远叶节点沿最长路径的节点数。
 */
public class MaximumDepthofBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    /**
     * 深度优先搜索DFS
     */
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
