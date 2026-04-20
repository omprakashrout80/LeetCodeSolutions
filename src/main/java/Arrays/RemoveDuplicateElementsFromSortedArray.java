package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateElementsFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,5};
        int[] newArr = removeDuplicateElements(arr);
        System.out.println(Arrays.toString(newArr));
    }

    static private int[] removeDuplicateElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i =0; i < arr.length; i++) {
            while (stack.isEmpty() || !stack.contains(arr[i])){
                stack.add(arr[i]);
            }
        }

        int[] newArr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i ++) {
            newArr[i] = stack.get(i);
        }
            return newArr;
    }

}
