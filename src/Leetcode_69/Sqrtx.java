package Leetcode_69;

public class Sqrtx {
    public static void main(String[] args) {
        Sqrtx s = new Sqrtx();
        System.out.println(s.mySqrt(4));
        System.out.println(s.mySqrt(8));
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = Integer.MAX_VALUE;
        int mid;
        while (true) {
            mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1)) return mid;
                left = mid + 1;
            }
        }
    }
}
