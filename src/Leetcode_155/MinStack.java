package Leetcode_155;

import java.util.Stack;

public class MinStack {

    class MinNode {
        int val;
        int min;
        public MinNode(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Stack<MinNode> stack;
    int min;

    public MinStack() {
        stack = new Stack<MinNode>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val < min) min = val;
        MinNode minNode = new MinNode(val, min);
        stack.push(minNode);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            if (!stack.isEmpty()) {
                min = stack.peek().min;
            } else {
                min = Integer.MAX_VALUE;
            }
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        else return stack.peek().val;
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;
        else return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
