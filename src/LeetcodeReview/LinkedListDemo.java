package LeetcodeReview;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        // Insert an element
        // Time complexity: O(N)
        list.add(2, 99);
        System.out.println(list.toString());

        // Search element
        int index = list.indexOf(99);
        System.out.println(index);

        // Update
        list.set(2, 88);
        System.out.println(list.toString());

        // Remove
        list.remove(2);
        System.out.println(list.toString());

        int length = list.size();
        System.out.println(length);
    }
}
