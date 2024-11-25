package Leetcode_26;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdfsq = new RemoveDuplicatesFromSortedArray();
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rdfsq.removeDuplicates(input));

    }

    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
