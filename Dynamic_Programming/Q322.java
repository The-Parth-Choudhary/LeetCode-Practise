package Dynamic_Programming;

public class Q322 {
    public static void main(String[] args) {
        int[] coins = {3, 7, 405, 436};
        System.out.println(coinChange(coins, 8839));
    }

    public static int coinChange(int[] coins, int amount) {
        // return helper(coins, amount, coins.length);
        Integer[] dp = new Integer[amount + 1];

        int ans = helper(coins, amount, dp);
        // System.out.println(Integer.MAX_VALUE);
        if (ans != Integer.MAX_VALUE) {
            return ans;
        }
        return -1;
    }

    private static int helper(int[] coins, int amount, Integer[] dp) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount] != null) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = helper(coins, amount - coins[i], dp);

            if (ans != Integer.MAX_VALUE) {
                min = Math.min(min, ans + 1);
            }
        }

        return dp[amount] = min;
    }
}
