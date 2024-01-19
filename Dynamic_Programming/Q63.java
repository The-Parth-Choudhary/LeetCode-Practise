package Dynamic_Programming;

public class Q63 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        Integer[][] dp = new Integer[obstacleGrid.length][obstacleGrid[0].length];

        return helper(obstacleGrid, 0, 0, dp);
    }

    private static int helper(int[][] grid, int i, int j, Integer[][] dp) {
        if (i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return 1;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int ans = 0;
        if (i < grid.length - 1 && grid[i + 1][j] != 1) {
            ans += helper(grid, i + 1, j, dp);
        }
        if (j < grid[i].length - 1 && grid[i][j + 1] != 1) {
            ans += helper(grid, i, j + 1, dp);
        }

        return dp[i][j] = ans;
    }
}
