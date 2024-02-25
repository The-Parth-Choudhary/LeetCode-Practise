package Graph;

import java.util.*;

public class Q994 {
    static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                }
            }
        }

        int ans = bfs(grid, q);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }

    private static int bfs(int[][] grid, Queue<Pair> q) {
        int ans = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean isAdded = false;

            while (size-- > 0) {
                int i = q.peek().i;
                int j = q.poll().j;

                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    q.offer(new Pair(i - 1, j));
                    isAdded = true;
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    q.offer(new Pair(i, j - 1));
                    isAdded = true;
                }
                if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    q.offer(new Pair(i + 1, j));
                    isAdded = true;
                }
                if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    q.offer(new Pair(i, j + 1));
                    isAdded = true;
                }
            }
            if (isAdded) ans++;
        }

        return ans;
    }
}
