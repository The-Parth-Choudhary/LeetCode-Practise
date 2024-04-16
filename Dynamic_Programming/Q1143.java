package Dynamic_Programming;

public class Q1143 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return helper(text1, text2, text1.length() - 1, text2.length() - 1, dp);
    }

    private static int helper(String text1, String text2, int n1, int n2, Integer[][] dp) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }

        if (dp[n1][n2] != null) {
            return dp[n1][n2];
        }

        int get = 0;

        if (text1.charAt(n1) == text2.charAt(n2)) {
            get = 1 + helper(text1, text2, n1 - 1, n2 - 1, dp);
        }

        int left = helper(text1, text2, n1, n2 - 1, dp);
        int right = helper(text1, text2, n1 - 1, n2, dp);
        return dp[n1][n2] = Math.max(get, Math.max(left, right));
    }
}
