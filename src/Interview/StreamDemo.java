package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        Predicate<String> p = (s) -> s.startsWith("A");

        memberNames.stream().filter(p).map(String::toLowerCase).toList();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(Arrays.toString(evenNumbersArr));

        List<String> l = Arrays.asList("A", "B", "C", "D");
        l = l.stream().peek(System.out::println).toList();
        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());
    }
}
