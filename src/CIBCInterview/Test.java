package CIBCInterview;


import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(3,1,2,4,6);
        List<Integer> list = stream.toList();
        Set<Integer> set = new HashSet<>(list);
        int max = Collections.max(list);
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.println("The missing number is " + i);
            }
        }
    }
}
