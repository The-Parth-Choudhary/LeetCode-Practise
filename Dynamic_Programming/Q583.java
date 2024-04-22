package Dynamic_Programming;

public class Q583 {
    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        Integer[][] dp = new Integer[word1.length()][word2.length()];
        int len = helper(word1, word2, word1.length() - 1, word2.length() - 1, dp);

        return (word1.length() + word2.length()) - 2 * len;
    }

    private static int helper(String word1, String word2, int n1, int n2, Integer[][] dp) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }

        if (dp[n1][n2] != null) {
            return dp[n1][n2];
        }

        if (word1.charAt(n1) == word2.charAt(n2)) {
            return 1 + helper(word1, word2, n1 - 1, n2 - 1, dp);
        }

        int left = helper(word1, word2, n1, n2 - 1, dp);
        int right = helper(word1, word2, n1 - 1, n2, dp);
        return dp[n1][n2] = Math.max(left, right);
    }
}
