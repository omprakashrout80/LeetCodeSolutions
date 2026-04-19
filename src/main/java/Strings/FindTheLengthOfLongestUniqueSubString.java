package Strings;

import java.util.HashSet;
import java.util.Set;

public class FindTheLengthOfLongestUniqueSubString {

    public static void main(String[] args) {
        String s = "aabccaadf";
        int length = findLongestUniqueSubStringLength(s);
        System.out.println(length);
    }

    private static int findLongestUniqueSubStringLength(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int i =0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
        }
        System.out.println(set);
        return set.size();
    }

}
