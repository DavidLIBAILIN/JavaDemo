package Leetcode_153;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray solution = new FindMinimuminRotatedSortedArray();
        int[] input = {2,3,4,5,1};
        System.out.println(solution.findMin(input));

    }

    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        int len = nums.length;

        int low = 0, high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            // First half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] < nums[mid + 1] && nums[low] < nums[(low + len - 1) % len]) {
                    return nums[low];
                } else {
                    low = mid + 1;
                }
            } else
            // Second half is sorted
            {
                if (nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                } else {
                    high = mid - 1;
                }
            }
        }
        return nums[low];
    }
}
