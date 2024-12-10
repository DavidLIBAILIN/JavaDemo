package Leetcode_3263;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertDoublyLinkedListtoArray1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.toString());
        System.out.println(Arrays.toString(list.toArray(Integer[]::new)));

        private void remove(Node node) {
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node == head) {
                head = node.next;
            }
            if (node == tail) {
                tail = node.prev;
            }
            node.prev = null;
            node.next = null;
        }
    }
}
