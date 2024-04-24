package Dynamic_Programming;

public class Q44 {
    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length()][p.length()];
        return helper(s, p, s.length() - 1, p.length() - 1, dp);
    }

    private static boolean helper(String s, String p, int n, int m, Boolean[][] dp) {
        if (n < 0) {
            for (int i = 0; i <= m; i++) {
                if (p.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }

        if (m < 0) {
            return false;
        }

        if (dp[n][m] != null) {
            return dp[n][m];
        }

        if (s.charAt(n) == p.charAt(m) || p.charAt(m) == '?') {
            return dp[n][m] = helper(s, p, n - 1, m - 1, dp);
        }

        if (p.charAt(m) == '*') {
            boolean op1 = helper(s, p, n - 1, m, dp);
            boolean op2 = helper(s, p, n, m - 1, dp);

            return dp[n][m] = op1 || op2;
        }

        return dp[n][m] = false;
    }
}
