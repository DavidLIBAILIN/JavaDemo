package LeetcodeReview;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        minheap.add(10);
        minheap.add(8);
        minheap.add(9);
        minheap.add(11);
        minheap.add(2);

        maxheap.add(10);
        maxheap.add(8);
        maxheap.add(9);
        maxheap.add(11);
        maxheap.add(2);

        System.out.println(minheap.toString());
        System.out.println(maxheap.toString());


        System.out.println(minheap.peek());
        System.out.println(maxheap.peek());

    }
}
