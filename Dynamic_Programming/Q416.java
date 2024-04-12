package Dynamic_Programming;

public class Q416 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            target += nums[i];
        }

        if (target % 2 == 1) {
            return false;
        }

        target /= 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return helper(nums, nums.length - 1, target, dp);
    }

    private static boolean helper(int[] nums, int n, int target, Boolean[][] dp) {
        if (target == 0) {
            return true;
        }
        if (n < 0 || target < 0) {
            return false;
        }

        if (dp[n][target] != null) {
            return dp[n][target];
        }

        boolean take = helper(nums, n - 1, target - nums[n], dp);
        boolean notTake = helper(nums, n - 1, target, dp);

        return dp[n][target] = take || notTake;
    }
}
