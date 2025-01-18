package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"David", "Ann", "Sherry", "Jack", "Peter", "Oliver", "Senera", "Alice", "Alice", "Alice", "Alice");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Merry", "Linda", "Bruce", "Apple", "May", "Jane", "Jenny", "Bob", "Jeff", "Henry", "Maria");

        list.stream().filter(s -> s.startsWith("A"))
                .forEach(System.out::print);
        System.out.println();

        list.stream().limit(3).forEach(System.out::println);
        System.out.println();

        list.stream().skip(3).forEach(System.out::println);
        System.out.println();

        // Get Jack
        list.stream().skip(3).limit(1).forEach(System.out::println);
        list.stream().limit(4).skip(3).forEach(System.out::println);
        System.out.println();
        list.stream().skip(7).distinct().forEach(System.out::println);
        System.out.println();
        Stream.concat(list.stream(), list1.stream()).forEach(System.out::println);




    }
}
