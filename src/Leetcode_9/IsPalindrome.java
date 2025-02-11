package Leetcode_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        int x = 121;
        System.out.println(ip.isPalindrome(x));
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list.toString());
    }

    private boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return (x == reverse || x == reverse / 10);
    }
}
