package StreamDemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        String[] arr2 = {"a", "b", "c", "d"};

        Arrays.stream(arr).forEach(s -> System.out.println(s));

        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        Stream.of(arr).forEach(s-> System.out.println(s));
    }
}
