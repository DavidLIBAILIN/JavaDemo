package Leetcode_274;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        HIndex hi = new HIndex();
        int[] citations = {3,0,6,1,5};
        System.out.println(hi.inthIndex(citations));
    }

    public int inthIndex(int[] citations) {
        // Sorting the citations in ascending order
        Arrays.sort(citations);
        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;
    }

}
