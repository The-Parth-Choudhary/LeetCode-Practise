package Dynamic_Programming;

public class Q576 {
    public static void main(String[] args) {
        System.out.println(findPaths(2, 2, 2, 0, 0));
    }

    private static int mod = (int)1e9+7;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Integer[][][] dp = new Integer[m+1][n+1][maxMove+1];

        return helper(m, n, maxMove, startRow, startColumn, dp);
    }

    private static int helper(int m, int n, int maxMove, int startRow, int startColumn, Integer[][][] dp){
        if(startRow == m || startRow < 0 || startColumn == n || startColumn < 0){
            return 1;
        }

        if(maxMove <= 0){
            return 0;
        }

        if(dp[startRow][startColumn][maxMove] != null){
            return dp[startRow][startColumn][maxMove];
        }

        int sum = 0;

        sum = (sum+helper(m, n, maxMove-1, startRow+1, startColumn, dp))%mod;
        sum = (sum+helper(m, n, maxMove-1, startRow-1, startColumn, dp))%mod;
        sum = (sum+helper(m, n, maxMove-1, startRow, startColumn+1, dp))%mod;
        sum = (sum+helper(m, n, maxMove-1, startRow, startColumn-1, dp))%mod;

        return dp[startRow][startColumn][maxMove] = sum;
    }
}
