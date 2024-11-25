package Leetcode_209;

import java.util.Map;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int cur = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length) {
            while (right < nums.length && cur < target) {
                cur += nums[right++];
            }
            while (cur >= target && left < right) {
                res = Math.min(res, right - left);
                cur -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }
}