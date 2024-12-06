package LeetcodeReview;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();

         // Add element
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.toString());

        // Get the top of the stack
        // Time complexity: O(1)
        System.out.println(stack.peek());

        // Remove the top of stack
        // Time complexity: O(1)
        System.out.println(stack.pop());

        stack.size();

        while (!stack.empty()){
            int num = stack.pop();
            System.out.println(num);
        }




    }
}
