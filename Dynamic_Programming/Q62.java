package Dynamic_Programming;

public class Q62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m][n];

        return helper(0, 0, m, n, dp);
    }

    private static int helper(int i, int j, int m, int n, Integer[][] dp) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        return dp[i][j] = helper(i + 1, j, m, n, dp) + helper(i, j + 1, m, n, dp);
    }
}
