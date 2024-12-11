package CIBCInterview;

import java.util.Scanner;

public class CharStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdefg";
        String result = "";
        String result2 = "";
        String result3 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        StringBuilder sb = new StringBuilder(str);
        result2 = sb.reverse().toString();

        StringBuffer sbuff = new StringBuffer(str);
        result3 = sbuff.reverse().toString();
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
