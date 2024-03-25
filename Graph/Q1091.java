package Graph;

import java.util.*;

public class Q1091 {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }

        int cnt = 0;
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;

        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;

            for (int t = 0; t < size; t++) {
                int i = q.peek()[0];
                int j = q.poll()[1];
                if (i == n - 1 && j == n - 1) {
                    return cnt;
                }

                for (int k = 0; k < 8; k++) {
                    int di = i + dx[k];
                    int dj = j + dy[k];

                    if (di >= 0 && di < n && dj >= 0 && dj < n && grid[di][dj] == 0) {
                        q.offer(new int[]{di, dj});
                        grid[di][dj] = 2;
                    }
                }
            }
        }

        return -1;
    }
}
