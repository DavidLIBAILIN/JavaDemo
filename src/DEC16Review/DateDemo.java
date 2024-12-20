package DEC16Review;

import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class DateDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Function<Integer, Integer> squared = value -> value * value;
        String s = "David";
        list.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> squaredNumbers = list.stream().map(squared).toList();
        System.out.println(squaredNumbers);
        Long[] longArr = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L};
        Double[] doubleArr = {1.0,2.0,3.0};
        List<Integer> list2 = List.of(18,2,3,4,5);
        Thread.State state = Thread.State.NEW;


        List<Integer> l = list2.stream().peek(System.out::println).toList();

    }
}
