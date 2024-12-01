package Leetcode_71;

import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("..")) {

            } else if (arr[i].equals("")) {

            } else {

            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (stack.isEmpty()) stringBuilder.append("/");
        else for (String s : stack) {
            stringBuilder.append("/" + s);
        }
        return stringBuilder.toString();
    }


}


    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("..") ) {if(!stack.isEmpty())stack.pop();}
            else if(arr[i].equals("") || arr[i].equals(".")){}
            else stack.push(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) sb.append("/");
        else for(String i : stack) sb.append("/"+i);
        return sb.toString();
    }
