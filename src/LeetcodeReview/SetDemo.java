package LeetcodeReview;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(null);

        System.out.println(set.toString());


        System.out.println(set.contains(2));

        set.remove(2);

        System.out.println(set.size());
    }
}
