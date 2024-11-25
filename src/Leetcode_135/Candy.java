package Leetcode_135;

import java.util.Arrays;

public class Candy {

    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] ratings = {1, 0, 2};
        System.out.println(candy.candy(ratings));

    }

    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] candy = new int[length];

        Arrays.fill(candy, 1);


        for (int i = 1; i < length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = length - 2; i <= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i + 1] + 1, candy[i]);
            }
        }

        int result = 0;
        for (int c : candy) {
            result += c;
        }

        return result;
    }
}
