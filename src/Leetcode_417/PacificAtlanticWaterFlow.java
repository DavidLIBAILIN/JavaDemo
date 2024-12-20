package Leetcode_417;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        PacificAtlanticWaterFlow p = new PacificAtlanticWaterFlow();
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // Base case: if the matrix is null
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;

        // The m*n matrix: m rows and n columns
        int m = heights.length;
        int n = heights[0].length;

        // Two matrix boards to store if it can reach different oceans
        boolean[][] canReachPacific = new boolean[m][n];
        boolean[][] canReachAtlantic = new boolean[m][n];

        // Left
        for (int i = 0; i < m; i++) {
            dfs(heights, canReachPacific, i, 0);
        }

        // Top
        for (int j = 0; j < n; j++) {
            dfs(heights, canReachPacific, 0, j);
        }

        // Right
        for (int i = 0; i < m; i++) {
            dfs(heights, canReachAtlantic, i, n-1);
        }

        // Bottom
        for (int j = 0; j < n; j++) {
            dfs(heights, canReachAtlantic, m-1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] canReachBoard, int row, int col) {
        if (canReachBoard[row][col]) {
            return;
        }

        // Initial corner cell is always true
        canReachBoard[row][col] = true;

        // Down, Right, Up, Left
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        for (int[] direction:directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow >= 0 && newRow < heights.length && newCol >= 0 && newCol < heights[0].length &&
                    !canReachBoard[newRow][newCol] && heights[newRow][newCol]>=heights[row][col]) {
                dfs(heights, canReachBoard, newRow, newCol);
            }
        }
    }
}
