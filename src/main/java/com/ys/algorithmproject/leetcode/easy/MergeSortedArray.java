package com.ys.algorithmproject.leetcode.easy;

/**
 * Create by YSOcean
 * 题目：给定两个已排序的数组nums1和nums2，将nums2元素有序合并到nums1中
 * 注意：nums1和nums2中初始化的元素数分别为m和n。可以假定nums1有足够的空间（大小大于或等于m+n）
 * 例子：nums1 = [1,2,3,0,0,0], m = 3
 *       nums2 = [2,5,6],       n = 3
 *      输出[1,2,2,3,5,6]
 */
public class MergeSortedArray {

    /**
     * 由于nums1数组足够大，而且给定了两个数组的实际大小，那么新数组长度为m+n
     * 可以从nums1和nums2数组的末尾进行比较，大的插入到数组末尾
     * 最后可能nums2数组还没比较完，这时候将nums2数组全部插入进去
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
