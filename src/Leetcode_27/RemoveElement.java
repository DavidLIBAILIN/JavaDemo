package Leetcode_27;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] input = {0,1,2,2,3,0,4,2};
        System.out.println(re.removeElement(input, 3));
    }

    public int removeElement(int[] nums, int val) {
        // j is the counter
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
