package com.ys.algorithmproject.leetcode.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static void main(String[] args) {

        TreeNode root1Left = new TreeNode(9);
        TreeNode root2Right = new TreeNode(7);
        TreeNode root2Left = new TreeNode(15);
        TreeNode root2 = new TreeNode(20, root2Left, root2Right);

        TreeNode root = new TreeNode(3, root1Left, root2);
        System.out.println("前序遍历");
        preOrder(root);
        System.out.println();
        System.out.println("中序遍历");
        infixOrder(root);
        System.out.println();
        System.out.println("后序遍历");
        postOrder(root);
    }

    //前序遍历
    public static void preOrder(TreeNode current) {
        if (current != null) {
            System.out.print(current.val + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    //中序遍历
    public static void infixOrder(TreeNode current) {
        if (current != null) {
            infixOrder(current.left);
            System.out.print(current.val + " ");
            infixOrder(current.right);
        }
    }

    //后序遍历
    public static void postOrder(TreeNode current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.val + " ");
        }
    }
}
