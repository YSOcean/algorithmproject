package com.ys.algorithmproject.leetcode.easy;

import java.util.Arrays;

/**
 * Create by YSOcean
 * 题目：给定一个元素按升序排序的数组，将其转换为高度平衡的bst(二叉搜索树，左节点<根节点<右节点)。
 * 注意：对于这个问题，高度平衡二叉树被定义为一个二叉树，其中每个节点的两个子树的深度相差不超过1。
 */
public class ConvertSortedArraytoBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int ptr=nums.length/2;
        TreeNode root=new TreeNode(nums[ptr]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,ptr));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,ptr+1,nums.length));
        return root;
    }
}


