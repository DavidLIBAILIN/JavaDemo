package Leetcode_20;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String input = "([])";
        System.out.println(vp.isValid(input));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character i : s.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || i != stack.pop()) {
                 return false;
            }
        }
        // No matching first half
        return stack.isEmpty();
    }
}
