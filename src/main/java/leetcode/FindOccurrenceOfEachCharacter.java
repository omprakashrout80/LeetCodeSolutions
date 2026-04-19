package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrenceOfEachCharacter {

    public static void main(String[] args) {
        String str = "programming";
        List<Map<String, Integer>> finder = findOccurrenceOfEachChar(str);

        System.out.println(finder);

    }

    private static List<Map<String, Integer>> findOccurrenceOfEachChar(String str) {

        Map<String, Integer> map = new HashMap<>();
        int frequency = 0;
        for (char c : str.toCharArray()) {
            if (map.containsKey(Character.toString(c))){
                frequency ++;
                map.put(Character.toString(c), frequency);
            } else {
                map.put(Character.toString(c), frequency);
            }
        }

        List<Map<String,Integer>> list = new ArrayList<>();
        list.add(map);
        return list;

    }

}
