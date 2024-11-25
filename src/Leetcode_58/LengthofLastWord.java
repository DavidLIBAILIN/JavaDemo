package Leetcode_58;

public class LengthofLastWord {
    public static void main(String[] args) {
       String input = "   fly me   to   the moon  ";
       LengthofLastWord lols = new LengthofLastWord();
        System.out.println(lols.lengthOfLastWord(input));
    }

    public int lengthOfLastWord(String s) {
        int counter = s.length() - 1;
        int length = 0;
        while(counter >= 0 && s.charAt(counter) == ' ') {
            counter--;
        }
        while(counter >=0 && s.charAt(counter) != ' ') {
            counter--;
            length++;
        }
        return length;
    }
}
