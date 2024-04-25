package Dynamic_Programming;

public class Q2370 {
    public static void main(String[] args) {
        String s = "abaccc";
        int k = 2;

        System.out.println(longestIdealString(s, k));
    }

    public static int longestIdealString(String s, int k) {
        Integer[][] dp = new Integer[s.length()][123];

        return helper(s, k, s.length() - 1, '#', dp);
    }

    private static int helper(String s, int k, int n, char last, Integer[][] dp) {
        if (n < 0) {
            return 0;
        }

        if (dp[n][last] != null) {
            return dp[n][last];
        }

        if (last == '#' || Math.abs(s.charAt(n) - last) <= k) {
            int take = 1 + helper(s, k, n - 1, s.charAt(n), dp);
            int notTake = helper(s, k, n - 1, last, dp);

            return dp[n][last] = Math.max(take, notTake);
        }

        return dp[n][last] = helper(s, k, n - 1, last, dp);
    }
}
