package CIBCInterview;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReverser {
    public static <T> Stream<T> reverseStream(Stream<T> stream, Class<T> clazz) {
        if (clazz != Integer.class && clazz != Long.class) {
            throw new IllegalArgumentException("Only Integer and Long streams are supported.");
        }

        List<T> list = stream.collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Long> longStream = Stream.of(1L, 2L, 3L, 4L, 5L);

        Stream<Integer> reversedIntStream = reverseStream(intStream, Integer.class);
        Stream<Long> reversedLongStream = reverseStream(longStream, Long.class);

        reversedIntStream.forEach(System.out::println); // Output: 5, 4, 3, 2, 1
        reversedLongStream.forEach(System.out::println); // Output: 5, 4, 3, 2, 1
    }
}
