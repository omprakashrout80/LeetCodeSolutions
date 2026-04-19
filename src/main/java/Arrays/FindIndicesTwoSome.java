package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindIndicesTwoSome {

    Map<Integer, Integer> map = new HashMap<>();

    int[] twoSome(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No indices found");
    }

    public static void main(String[] args) {

        FindIndicesTwoSome obj = new FindIndicesTwoSome();
        int[] resArray = obj.twoSome(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(Arrays.toString(resArray));

    }

}
