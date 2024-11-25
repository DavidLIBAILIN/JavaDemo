package Leetcode_28;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        FindtheIndexoftheFirstOccurrenceinaString fifos = new FindtheIndexoftheFirstOccurrenceinaString();
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = fifos.strStr(haystack, needle);
        System.out.println(result);
    }

    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i, i + l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
