package Dynamic_Programming;

public class Q518 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(change(5, coins));
    }

    public static int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[amount + 1][coins.length];

        int ans = helper(coins, coins.length - 1, amount, dp);
        return ans;
    }

    private static int helper(int[] coins, int index, int amount, Integer[][] dp) {
        if (index == 0) {
            if (amount % coins[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (dp[amount][index] != null) {
            return dp[amount][index];
        }

        int notTake = helper(coins, index - 1, amount, dp);
        int take = 0;
        if (coins[index] <= amount) {
            take = helper(coins, index, amount - coins[index], dp);
        }

        return dp[amount][index] = take + notTake;
    }
}
