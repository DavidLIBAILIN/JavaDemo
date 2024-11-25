package Leetcode_14;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] input = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        // Loop through all items in the strings array
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // Exit condition
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}
