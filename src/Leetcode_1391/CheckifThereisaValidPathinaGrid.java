package Leetcode_1391;

import java.util.LinkedList;
import java.util.Queue;

public class CheckifThereisaValidPathinaGrid {

    private final int[][][] dirs = {
            {{0, -1}, {0, 1}},
            {{-1, 0}, {1, 0}},
            {{0, -1}, {1, 0}},
            {{0, 1}, {1, 0}},
            {{0, -1}, {-1, 0}},
            {{0, 1}, {-1, 0}}
    };

    public static void main(String[] args) {

        int[][] input = {{1,2,1}, {1,2,1}};
        CheckifThereisaValidPathinaGrid test = new CheckifThereisaValidPathinaGrid();
        System.out.println(test.hasValidPath(input));

    }

    public boolean hasValidPath(int[][] grid) {

        // m * n grid
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            // x, y coordinates
            int x = cur[0], y = cur[1];
            int num = grid[x][y] - 1;
            for (int[] dir : dirs[num]) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny]) continue;
                //go to the next cell and come back to orign to see if port directions are same
                for (int[] backDir : dirs[grid[nx][ny] - 1])
                    if (nx + backDir[0] == x && ny + backDir[1] == y) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
            }


        }
        return visited[m - 1][n - 1];
    }
}
