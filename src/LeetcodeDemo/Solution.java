import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        char key = 'i';
        int startIndex = 2;
        int endIndex = 4;

        System.out.println(Arrays.binarySearch(vowels, startIndex, endIndex, key));

    }
}