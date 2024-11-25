package Leetcode_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int lookingfor;
        for (int i = 0; i < nums.length; i++) {
            lookingfor = target - nums[i];
            if (map.containsKey(lookingfor)) {
                result[0] = map.get(lookingfor);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
