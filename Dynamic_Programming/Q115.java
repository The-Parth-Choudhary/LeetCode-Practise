package Dynamic_Programming;

public class Q115 {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s, t));
    }

    public static int numDistinct(String s, String t) {
        Integer[][] dp = new Integer[s.length()][t.length()];

        return helper(s, t, s.length() - 1, t.length() - 1, dp);
    }

    private static int helper(String s, String t, int n, int m, Integer[][] dp) {
        if (m < 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (dp[n][m] != null) {
            return dp[n][m];
        }

        if (s.charAt(n) == t.charAt(m)) {
            return dp[n][m] = helper(s, t, n - 1, m - 1, dp) + helper(s, t, n - 1, m, dp);
        }

        return dp[n][m] = helper(s, t, n - 1, m, dp);
    }
}
