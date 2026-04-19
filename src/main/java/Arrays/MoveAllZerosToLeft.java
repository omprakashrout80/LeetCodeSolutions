package Arrays;

import java.util.Arrays;

public class MoveAllZerosToLeft {

    public static void main(String[] args) {
        int[] arr = {1, 0, 6, 9, 0, 0, 3, 0};
        moveAllZerosToLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveAllZerosToLeft(int[] arr) {
        int right = arr.length - 1;

        for (int i = arr.length - 1; i>=0;  i--) {
            if (arr[i] != 0) {
                arr[right] = arr[i];
                right--;
            }
        }

        while (right >= 0) {
            arr[right] = 0;
            right--;
        }
    }

}
