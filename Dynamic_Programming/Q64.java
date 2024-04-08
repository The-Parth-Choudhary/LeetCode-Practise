package Dynamic_Programming;

import javax.sound.midi.Soundbank;

public class Q64 {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];

        return helper(grid, 0, 0, dp);
    }

    private static int helper(int[][] grid, int i, int j, Integer[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        if (i + 1 < grid.length) {
            min = Math.min(min, helper(grid, i + 1, j, dp));
        }
        if (j + 1 < grid[0].length) {
            min = Math.min(min, helper(grid, i, j + 1, dp));
        }

        return dp[i][j] = min + grid[i][j];
    }
}
