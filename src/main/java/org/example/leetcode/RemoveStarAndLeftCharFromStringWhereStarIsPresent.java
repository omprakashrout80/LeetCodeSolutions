package org.example.leetcode;

import java.util.Stack;

public class RemoveStarAndLeftCharFromStringWhereStarIsPresent {

    public static void main(String[] args) {
        String str = "Lee*t**co*de";
        String formatedString = formatString(str);
        System.out.println(formatedString);

    }

    private static String formatString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if ("*".equalsIgnoreCase(Character.toString(c))) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();

    }

}
