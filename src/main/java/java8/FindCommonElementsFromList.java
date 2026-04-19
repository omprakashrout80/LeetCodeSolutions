package java8;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsFromList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(2,3,7,8,9,1);

        List<Integer> commonList = list1.stream().filter(list2 :: contains).toList();

        System.out.println(commonList);

    }
}
