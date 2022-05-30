package com.ys.algorithmproject.leetcode.tree;

// 二叉树的最大深度
// https://leetcode.cn/problems/maximum-depth-of-binary-tree/
public class MaxDepth {

    // 记录最大深度
    public static int res = 0;
    // 记录遍历到的节点的深度
    public static int depth = 0;

    /**
     * 通过遍历记录每个节点的深度，最后取最大值
     *
     * @param root
     * @return
     */
    public static int maxDepth1(TreeNode root) {
        traverse(root);
        return res;
    }

    public static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 前序位置
        depth++;
        traverse(root.left);
        if (root.left == null && root.right == null) {
            // 到达叶子节点，更新最大深度
            res = Math.max(res, depth);
        }
        traverse(root.right);
        // 后序位置
        depth--;
    }


    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int maxLeft = maxDepth2(root.left);
            int maxRight = maxDepth2(root.right);
            return Math.max(maxLeft, maxRight) + 1;
        }
    }
}
