package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"David-18", "Ann-19", "Sherry-17", "Jack-21", "Peter-22", "Oliver-32", "Senera-16", "Alice-30");

        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(System.out::println);

    }
}
