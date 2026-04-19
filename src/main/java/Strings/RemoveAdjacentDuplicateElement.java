package Strings;

import java.util.Stack;

public class RemoveAdjacentDuplicateElement {

    public static void main(String[] args) {
        String str = "abbaca";
        String finalElement = removeAdjacentDuplicates(str);

        System.out.println(finalElement);
    }

    private static String removeAdjacentDuplicates(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
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
