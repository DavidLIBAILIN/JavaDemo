package Leetcode_228;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] input = {0, 1, 2, 4, 5, 7};
        Instant start = Instant.now();
        System.out.println(summaryRanges.summaryRanges(input));
        Instant end = Instant.now();
        System.out.println("Time used: " + Duration.between(start, end).toString());

    }

    private List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();
        // Check if j + 1 extends the range [nums[i], nums[j]]
        for (int i = 0, j = 0; j < nums.length; ++j) {
            if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) continue;
            // Put the range [nums[i], nums[j]] into the list
            if (i == j) summary.add(nums[i] + "");
            else summary.add(nums[i] + "->" + nums[j]);
            i = j + 1;
        }
        return summary;
    }
}
