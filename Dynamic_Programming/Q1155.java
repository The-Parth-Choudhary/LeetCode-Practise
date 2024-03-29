package Dynamic_Programming;

public class Q1155 {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30, 30, 500));
    }

    public static int numRollsToTarget(int n, int k, int target) {
        Integer[][] dp = new Integer[n+1][target+1];
        return helper(n, k, target, dp);
    }

    private static int helper(int n, int k, int target, Integer[][] dp){
        if(n == 0){
            if(target == 0){
                return 1;
            }

            return 0;
        }

        if(dp[n][target] != null){
            return dp[n][target];
        }

        long cnt = 0;

        for(int i = 1; i <= k; i++){
            if(target-i >= 0){
                cnt += helper(n-1, k, target - i, dp)%(1e9+7);
            }
        }

        return dp[n][target] = (int)(cnt%(1e9+7));
    }
}
