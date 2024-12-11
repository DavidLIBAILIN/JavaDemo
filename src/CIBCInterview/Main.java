package CIBCInterview;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static <T> Stream<T> reverse(Stream<T> stream) {
        return stream.collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return list.stream();
                }
        ));
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        reverse(list.stream()).forEach(System.out::println); // Output: 5, 4, 3, 2, 1
    }
}





