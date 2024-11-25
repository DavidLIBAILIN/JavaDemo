package Leetcode_35;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(sip.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot +1;
            }
        }
        return left;
    }
}
