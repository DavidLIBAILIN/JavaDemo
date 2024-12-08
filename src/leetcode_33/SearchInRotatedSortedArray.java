package leetcode_33;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int[] input = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(solution.search(input,target));
    }

    public int search(int[] a, int key) {
        int mid, low = 0, high = a.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a[mid] == key) {
                return mid;
            }

            // First half is sorted
            if (a[low] <= a[mid]) {
                if (a[low] <= key && key < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            else {
                // Second half is sorted
                if (a[mid] < key && key <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
