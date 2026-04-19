package Arrays;

public class MaxSumSubArrayKadanesAlgo {

    public static void main(String[] args) {
        int[] arr = {1, -1, -3, 5, 1};

        int maxSumSubArray = findMaxSumSubArray(arr);

        System.out.println(maxSumSubArray);
    }

    private static int findMaxSumSubArray(int[] arr) {
        int currentMax = arr[0];
        int maxSum = arr[0];

        for (int j : arr) {
            currentMax = Math.max(j, currentMax + j);
            maxSum = Math.max(maxSum, currentMax);

        }

        return maxSum;

    }

}
