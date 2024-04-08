package Dynamic_Programming;

import java.util.*;

public class Q120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.getLast().size();
        Integer[][] dp = new Integer[n][m];

        return helper(triangle, 0, 0, n, m, dp);
    }

    private static int helper(List<List<Integer>> triangle, int i, int j, int n, int m, Integer[][] dp) {
        if (i == n || j >= triangle.get(i).size()) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        return dp[i][j] = triangle.get(i).get(j) + Math.min(helper(triangle, i + 1, j, n, m, dp), helper(triangle, i + 1, j + 1, n, m, dp));
    }
}
