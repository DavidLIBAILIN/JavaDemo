package Leetcode_1801;

import java.util.PriorityQueue;

public class NumberOfOrdersInTheBacklog {
    public static void main(String[] args) {

        NumberOfOrdersInTheBacklog n = new NumberOfOrdersInTheBacklog();
    }

    public int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<int[]> buy = new PriorityQueue<>((a, b) -> (b[0] - a[0]));
        PriorityQueue<int[]> sell = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        return 1024;
    }
}
