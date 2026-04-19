package leetcode;

import java.util.Arrays;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 3, 0, 4, 5, 6, 0};
        sortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortedArray(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[left] = arr[i];
                left++;
            }
        }

        while (left < arr.length) {
            arr[left] = 0;
            left++;
        }

        return arr;

    }
}
