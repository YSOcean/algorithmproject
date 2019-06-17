package com.ys.algorithmproject.leetcode.demo.sort;

import java.util.Arrays;

/**
 * Create by YSOcean
 */
public class SortTest {

    /**
     * 冒泡排序
     * @param array
     * @return
     */
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

    /**
     * 选择排序（不稳定）
     * @param array
     * @return
     */
    public static int[] choiceSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while(j>0 && temp<array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,9,8,2,7,6,4};
        //bubbleSort(array);

        //choiceSort(array);

        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
