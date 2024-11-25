package Leetcode_9;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        int x = 121;
        System.out.println(ip.isPalindrome(x));
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
