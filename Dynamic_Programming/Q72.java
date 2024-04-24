package Dynamic_Programming;

public class Q72 {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        if (word1.isEmpty() && word2.isEmpty()) {
            return 0;
        }
        if (word1.isEmpty() || word2.isEmpty()) {
            return 1;
        }

        Integer[][] dp = new Integer[word1.length()][word2.length()];
        return helper(word1, word2, word1.length() - 1, word2.length() - 1, dp);
    }

    private static int helper(String s, String t, int n, int m, Integer[][] dp) {
        if (n < 0 && m < 0) {
            return 0;
        }
        if (n < 0 || m < 0) {
            return Math.max(n + 1, m + 1);
        }

        if (dp[n][m] != null) {
            return dp[n][m];
        }

        if (s.charAt(n) == t.charAt(m)) {
            return dp[n][m] = helper(s, t, n - 1, m - 1, dp);
        }

        int op1 = 1 + helper(s, t, n - 1, m - 1, dp);
        int op2 = 1 + helper(s, t, n - 1, m, dp);
        int op3 = 1 + helper(s, t, n, m - 1, dp);

        return dp[n][m] = Math.min(op1, Math.min(op2, op3));
    }
}
