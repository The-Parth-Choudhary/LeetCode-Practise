package Dynamic_Programming;

public class Q279 {
    public static void main(String[] args) {
        System.out.println(numSquares(1995));
    }

    public static int numSquares(int n) {
        Integer[] dp = new Integer[n + 1];
        return helper(n, dp);
    }

    private static int helper(int n, Integer[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[n] != null) {
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + helper(n - (i * i), dp));
        }

        return dp[n] = ans;
    }
}
