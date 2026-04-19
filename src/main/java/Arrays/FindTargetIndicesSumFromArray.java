package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetIndicesSumFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 9;
        int[] targetIndices = findTargetIndices(arr, target);

        System.out.println(Arrays.toString(targetIndices));
    }

    private static int[] findTargetIndices(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i <arr.length; i++){
            int temp = target-arr[i];
            if (map.containsKey(temp)){
                return new int[] {map.get(temp), i};
            } else
                map.put(arr[i],i);
        }
        throw new IllegalArgumentException("not found");
    }

}
