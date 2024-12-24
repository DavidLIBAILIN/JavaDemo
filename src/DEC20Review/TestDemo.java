package DEC20Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Demo {
    String name;
    int age;
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String[] strArr = {"a", "b", "c"};
        Demo demo = new Demo("David", 28);
        List<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }
        String s = "I love you";
        String[] strArray = s.split(" ");

        for (String str : strArray) {
            System.out.println(str);
        }
        List<Demo> demoList = List.of(demo);
        List<String> strList = Arrays.asList(strArr);
        System.out.println(arrList);

        String[] result = strList.toArray(new String[0]);
        for (String str : result) {
            System.out.println(str);
        }


    }
}
