package Leetcode_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NQueensII {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3");
        System.out.println(list.toString());
        System.out.println(list.toString());
        System.out.println(list.toString());

        String str = "2";


        switch (str) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
                case "3":
                    System.out.println("3");
                    break;
            default:
                System.out.println("5");
                break;
        }

        int num = 3;

        switch (num) {
            case 1 -> {
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("2");
            }
            case 3 -> {
                System.out.println("3");
            }
            default -> System.out.println("3");
        }

        int[] array = new int[]{1, 2, 3};
        int[] intArr = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        for (int i : intArr) {
            System.out.println(i);
        }
        String s = "abc";
        String[] split = s.split(",");
    }
}
