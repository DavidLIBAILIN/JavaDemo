package Leetcode_704;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {-1,0,3,5,9,12};
        System.out.println(binarySearch.search(input, 9));
    }

    public int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            // 1,2,3,4,5 pivot = 3
            // 1,2,3,4 pivot = 2
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}
