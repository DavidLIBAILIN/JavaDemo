package Leetcode_456;

import java.util.Stack;
import java.util.regex.Pattern;

public class Pattern132 {
    public static void main(String[] args) {
        Pattern132 solution = new Pattern132();
        int[] input = {3,1,4,2};
        System.out.println(solution.find132pattern(input));
    }
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int j = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                j = stack.pop();
            }
        }
        return true;
    }
}
