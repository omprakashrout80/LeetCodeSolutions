package Arrays;

public class FindMissingNumberFromAnArray {

    public static void main(String[] args) {

        //if n is given
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        int missingElement = findMissingElementIfNisGiven(arr, n);

        //if n is not given

        int misElement = findMissingElement(arr);

        System.out.println("n is given : " + missingElement);
        System.out.println("n is not given : " + misElement);


    }

    private static int findMissingElement(int[] arr) {

        int size = arr[0];
        int currentSum = 0;
        for (int i : arr) {
            if (size < i) {
                size = i;
            }
            currentSum += i;
        }

        int expSum = size * (size + 1) / 2;

        return expSum - currentSum;

    }

    private static int findMissingElementIfNisGiven(int[] arr, int n) {
        int expSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expSum - actualSum;
    }

}
