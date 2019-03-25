package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：对于二叉树，检查它是否是自身的镜像（即，围绕其中心对称）。
 * 例子：[1,2,2,3,4,4,3] 是中心对称的
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 */
public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 和前面 SameTree 一样，通过递归来比较
     */
    public boolean isSymmetric(TreeNode root) {

        return root == null || isSymmetricHelp(root.left,root.right);
    }
    private boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
}
