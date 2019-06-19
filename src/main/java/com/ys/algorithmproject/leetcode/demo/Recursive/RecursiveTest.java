package com.ys.algorithmproject.leetcode.demo.Recursive;

import java.util.Arrays;

/**
 * @ Copyright (C), 2015-2019, kxjl.com
 * @ Author:   shuaiyu
 * @ Date:     Created in 2019/6/18 15:49
 * @ Description: 递归测试
 * @ Modified By：
 * @ Version: 1.0
 */
public class RecursiveTest {

    /**
     * @Author: yuShuai
     * @Description: 求阶乘的递归   n!
     * @Date: 2019/6/18 15:56
     * @params:
     * @return:
     */
    public static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }


    /**
     * @Author: yuShuai
     * @Description: 求阶乘的循环   n!
     * @Date: 2019/6/18 15:56
     * @params:
     * @return:
     */
    public static int factorial_for(int n){
        if(n<2){
            return 1;
        }
        int result = 1;
        for (int i = n; i > 1 ; i--) {
            result *= i;
        }
        return result;
    }

    /**
     * @Author: yuShuai
     * @Description: 二分查找法（通过for循环）,找到返回下标，找不到返回-1
     * @Date: 2019/6/18 16:05
     * @params:
     * @return:
     */
    public static int binarySearch_for(int[] array,int n){
        if(array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left<=right){
            int mid = (right-left)/2+left;
            if(array[mid]>n){
                right = mid -1;
            }else if(array[mid]<n){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    /**
     * @Author: yuShuai
     * @Description: 二分查找法（递归）,找到返回下标，找不到返回-1
     * @Date: 2019/6/18 16:50
     * @params:
     * @return:
     */
    public static int binarySearch(int[] array,int n){
        if(array == null && array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        return binary(array,n,left,right);
    }

    public static int binary(int[] array,int key,int left,int right){
        int mid = (right-left)/2 + left;
        if(key == array[mid]){
            return mid;
        }else if(left>right){
            return -1;
        }else if(key > array[mid]){
            return binary(array,key,mid+1,right);
        }else {
            return binary(array,key,left,mid-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("递归测试");
        System.out.println(factorial(5));
        System.out.println(factorial_for(5));

        int[] array = {3,5,8,9,1,2,7,6,4};
        Arrays.sort(array);
        System.out.println(binarySearch_for(array, 3));

        System.out.println(binarySearch(array, 3));
    }
}
