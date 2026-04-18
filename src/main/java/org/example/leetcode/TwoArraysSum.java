package org.example.leetcode;

import java.util.Arrays;

public class TwoArraysSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 1, 1};
        int[] sumArray = twoArraysSum(arr, arr1);
        System.out.println("Sum array is : " + Arrays.toString(sumArray));
    }

    private static int[] twoArraysSum(int[] arr, int[] arr1) {

        int n = arr.length;
        int[] resArray = new int[n];
        for (int i = 0; i < n; i++) {
            resArray[i] = arr[i] + arr1[i];
        }
        return resArray;
    }

}
