package Leetcode_74;

public class Searcha2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        Searcha2DMatrix solution = new Searcha2DMatrix();
        System.out.println(solution.searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        // row = m
        int m = matrix.length;
        if (m == 0) return false;

        // column = n
        int n = matrix[0].length;

        // Binary Search
        int left = 0, right = m * n - 1;
        int pivotIndex, pivotElement;
        while (left <= right) {
            pivotIndex = left + (right - left) / 2;
            pivotElement = matrix[pivotIndex / n][pivotIndex % n];
            if (target == pivotElement) {
                return true;
            } else {
                if (target > pivotElement) {
                    left = pivotIndex + 1;
                } else {
                    right = pivotIndex - 1;
                }
            }
        }
        return false;
    }
}
