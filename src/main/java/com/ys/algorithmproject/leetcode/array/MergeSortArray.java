package com.ys.algorithmproject.leetcode.array;

// https://leetcode.cn/problems/merge-sorted-array/
// 合并两个有序数组
public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int[] newArray = new int[m + n];
        int left = 0;
        int right = 0;
        int i = 0;
        while (left < m && right < n) {
            if (nums1[left] > nums2[right]) {
                newArray[i++] = nums2[right++];
            } else {
                newArray[i++] = nums1[left++];
            }
        }
        while (left < m) {
            newArray[i++] = nums1[left++];
        }
        while (right < n) {
            newArray[i++] = nums2[right++];
        }
        for (int j = 0; j < newArray.length; j++) {
            nums1[j] = newArray[j];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
}
