class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseString("Test");
        System.out.println(result);
    }

    private String reverseString(String string) {
        char[] charArray = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append("Str".toCharArray());
        }
        return sb.toString();
    }
}
