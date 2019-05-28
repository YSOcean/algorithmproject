package com.ys.algorithmproject.leetcode.demo.sort;

import java.util.Arrays;

/**
 * Create by YSOcean
 */
public class SortTest {

    public static int[] bubbleSort(int[] array){
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,9,8,2,7,6,4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
