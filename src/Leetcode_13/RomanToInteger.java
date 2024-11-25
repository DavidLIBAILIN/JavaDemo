package Leetcode_13;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String input = "MCMXCIV";
        System.out.println(rti.romanToInt(input));
    }

    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> nums[i] = 1;
                case 'V' -> nums[i] = 5;
                case 'X' -> nums[i] = 10;
                case 'L' -> nums[i] = 50;
                case 'C' -> nums[i] = 100;
                case 'D' -> nums[i] = 500;
                case 'M' -> nums[i] = 1000;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }
        sum += nums[s.length() - 1];
        return sum;
    }
}
