package CIBCInterview;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStreamExample {

    public static <T> Stream<T> reverseStream(Stream<T> stream) {
        if (T instanceof Integer || T instanceof Long) {
            List<T> list = new java.util.ArrayList<>(stream.toList());
            Collections.reverse(list);
            return list.stream();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Stream<Long> longStream = Stream.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> reversedIntegerStream = reverseStream(integerStream);
        Stream<Long> reversedLongStream = reverseStream(longStream);

        System.out.println(reversedLongStream.toList());
        System.out.println(reversedIntegerStream.toList());
    }
}
