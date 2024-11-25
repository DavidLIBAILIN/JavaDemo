package Leetcode_88;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        msa.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[i + j + 1] = nums1[i];
                i--;
            } else {
                nums1[i + j + 1] = nums2[i];
                j--;
            }
        }
        while(j >= 0) {
            nums1[j] = nums2[j];
            j--;
        }
    }

}
