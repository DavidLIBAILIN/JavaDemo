package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"David-M-18", "Ann-F-19", "Sherry-F-17", "Jack-M-21", "Peter-M-22", "Oliver-M-32", "Senera-F-16", "Alice-F-30");

        Map<String, String> m = list.stream().filter(s -> s.split("-")[1].equals("M"))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));

        System.out.println(m);
    }
}
