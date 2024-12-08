package Leetcode_532;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairsinanArray {

    public int findPairs(int[] nums, int k) {
        if (nums == null || k < 0) return 0;
        Set<Integer> set = new HashSet<>();

        int count = 0;
        int prevPair = 1000001;

        for (int n : nums) {
            if (set.contains(n)) {
                if (k == 0 && n != prevPair) {
                    count++;
                    prevPair = n;
                }
                continue;
            }

            if (set.contains(n - k)) count++;
            if (set.contains(n + k)) count++;
            set.add(n);
        }
        return count;
    }
}
