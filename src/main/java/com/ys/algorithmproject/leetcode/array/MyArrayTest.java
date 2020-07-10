package com.ys.algorithmproject.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayTest {
    public static void main(String[] args) {
//       int[] nums1 = {1,2,3,0,0,0};
//       int[] nums2 = {4,5,6};
//        merge(nums1,3,nums2,3);
    }
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-temp>max){
                    max = prices[j]-temp;
                }
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tringleList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j==0 || j==i){
                    tempList.add(1);
                }else{
                    tempList.add(tringleList.get(i-1).get(j-1)+tringleList.get(i-1).get(j));
                }
            }
            tringleList.add(tempList);
        }
        return tringleList;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);

    }

    public static int[] plusOne(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i]*Math.pow(10,digits.length-i-1);
        }
        sum = sum + 1;
        int [] result = new int[digits.length+1];
        int index = digits.length;
        while(sum/10>0){
            int i = sum % 10;
            result[index--] = i;
            sum = sum / 10;
            if(sum<10){
                result[index--] = sum;
                break;
            }
        }
        if(result[0]==0){
            int[] newArray = new int[result.length-1];
            for (int i = 1; i < result.length; i++) {
                newArray[i-1] = result[i];
            }
            return newArray;
        }
        return result;
    }
}
