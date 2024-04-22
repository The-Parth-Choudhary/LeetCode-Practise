package Dynamic_Programming;

public class Q1312 {
    public static void main(String[] args) {
        String s = "mbadm";
        System.out.println(minInsertions(s));
    }

    public static int minInsertions(String s) {
        Integer[][] dp = new Integer[s.length()][s.length()];
        int len = helper(s, 0, s.length() - 1, dp);

        return s.length() - len;
    }

    private static int helper(String s, int i, int j, Integer[][] dp) {
        if (i >= s.length() || j < 0) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (s.charAt(i) == s.charAt(j)) {
            return 1 + helper(s, i + 1, j - 1, dp);
        }

        int left = helper(s, i + 1, j, dp);
        int right = helper(s, i, j - 1, dp);

        return dp[i][j] = Math.max(left, right);
    }
}
