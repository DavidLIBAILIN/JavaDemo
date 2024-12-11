package CIBCInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        memberNames.stream().filter(p).forEach((s) -> System.out.println(s));
    }
}
