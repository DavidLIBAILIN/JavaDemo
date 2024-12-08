package Leetcode_300;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        int[] input = {10,9,2,5,3,7,101,18};
        System.out.println(solution.lengthOfLIS(input));

    }
    public int lengthOfLIS(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int num : nums) {

            int pos = binarySearch(ans, num);

            if(pos == ans.size()) {
                ans.add(num);
            }
            else {
                ans.set(pos, num);
            }
        }
        return ans.size();
        System.arraycopy();
    }


    // Binary Search O(logN)
    public int binarySearch(List<Integer> ans, int target) {
        int low = 0;
        int high = ans.size() - 1;

        while(low <= high) {

            int mid = low + (high-low)/2;

            // Make sure it is increasing
            if(ans.get(mid) < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
