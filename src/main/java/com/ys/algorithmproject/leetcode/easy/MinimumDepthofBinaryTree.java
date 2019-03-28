package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定二叉树，求其最小深度。
 * 注意：最小深度是从根节点到最近的叶节点沿最短路径的节点数。
 */
public class MinimumDepthofBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
    }
}
