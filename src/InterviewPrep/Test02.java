package InterviewPrep;

import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        String s = "sss";
        String t = "sss";
        String s1 = "hello";
        char c = s1.charAt(2);
        String s2 = "hello";
        Person p = new Person("David", 28);
        Person p1 = new Person("David", 28);
        System.out.println(p1);

        System.out.println(p.equals(p1));
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double[] array = list.stream().mapToDouble(Integer::doubleValue).toArray();
        System.out.println(p1 == p);
        System.out.println(s1 == s2);
    }
}
