package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

//        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
//
//        Stream.of("a", "b", "c").forEach(System.out::println);


        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        List<String> list3 = Arrays.asList("g", "h", "i");

        List<List<String>> list = Arrays.asList(list1, list2, list3);

        list.stream().flatMap(l -> l.stream()).forEach(s -> System.out.println(s));
    }
}
