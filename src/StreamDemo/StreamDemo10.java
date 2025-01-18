package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"David", "Ann", "Sherry", "Jack", "Peter", "Oliver", "Senera", "Alice", "Alice", "Alice", "Alice");

        long count = list.stream().count();
        System.out.println(count);

//        Object[] array = list.stream().toArray();
//        System.out.println(Arrays.toString(array));

        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array));

        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));
    }
}
