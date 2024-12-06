package LeetcodeReview;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.toString());

        int temp1 = queue.peek();
        System.out.println(temp1);

        int temp2 = queue.poll();
        System.out.println(temp2);
        System.out.println(queue.toString());

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println(temp);
        }
    }
}
