package LeetcodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

        int[] c = {10,3,4,2};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        System.out.println(list.toString());
        list.sort(Integer::compareTo);
        System.out.println(list.toString());
    }
}
