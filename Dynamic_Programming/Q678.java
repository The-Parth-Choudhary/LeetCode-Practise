package Dynamic_Programming;

public class Q678 {
    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()][s.length()];

        return helper(s, 0, 0, dp);
    }

    private static boolean helper(String s, int n, int cnt, Boolean[][] dp) {
        if (n == s.length()) {
            return cnt == 0;
        }

        if (cnt < 0) {
            return false;
        }

        if (dp[n][cnt] != null) {
            return dp[n][cnt];
        }

        if (s.charAt(n) == ')') {
            return dp[n][cnt] = helper(s, n + 1, cnt - 1, dp);
        } else if (s.charAt(n) == '(') {
            return dp[n][cnt] = helper(s, n + 1, cnt + 1, dp);
        }

        boolean op1 = helper(s, n + 1, cnt, dp);
        boolean op2 = helper(s, n + 1, cnt + 1, dp);
        boolean op3 = helper(s, n + 1, cnt - 1, dp);

        return dp[n][cnt] = op1 || op2 || op3;
    }
}
