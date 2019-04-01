package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定一个二叉树和一个和，确定该树是否有一个根节点到叶子节点的路径，以便将路径上的所有值相加等于给定的和。
 * 注意：叶子节点表示没有子节点
 */
public class PathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
