package Leetcode_189;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
                ra.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = newArray[i];
        }
    }
}
