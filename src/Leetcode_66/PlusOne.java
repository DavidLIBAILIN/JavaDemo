package Leetcode_66;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] input = {9,9,9};
        int[] result = po.plusOne(input);
        System.out.println(Arrays.toString(result));
    }
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        // If 999 result: [0, 0, 0, 0]
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}