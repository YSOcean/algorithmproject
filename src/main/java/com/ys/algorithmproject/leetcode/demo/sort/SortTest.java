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

    public static int[] quickSort(int[] array){
        recQuickSort(array,0,array.length-1);
        return array;
    }

    private static void recQuickSort(int[] array,int left,int right){
        if(left>=right){
            return;
        }else{
            int partition = partitionIt(array,left,right);
            recQuickSort(array,left,partition-1);
            recQuickSort(array,partition+1,right);
        }
    }

    private static int partitionIt(int[] array,int left,int right){
        int i = left;
        int j = right + 1;
        int pivot = array[left];
        while(true){
            while(i<right && array[++i] < pivot){}

            while(j>0 && array[--j] > pivot){}

            if(i>=j){
                break;
            }else{
                swap(array,i,j);
            }
        }
        swap(array,left,j);
        return j;
    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {3,5,1,9,8,2,7,6,4};
        //bubbleSort(array);

        //choiceSort(array);

        //insertSort(array);

        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
