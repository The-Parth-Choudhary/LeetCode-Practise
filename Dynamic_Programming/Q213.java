package Dynamic_Programming;

public class Q213 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Integer[] dp1 = new Integer[nums.length];
        Integer[] dp2 = new Integer[nums.length];
        return Math.max(helper(nums, 1, nums.length, dp1), helper(nums, 0, nums.length - 1, dp2));
    }

    private static int helper(int[] nums, int s, int e, Integer[] dp) {
        if (s >= e) {
            return 0;
        }

        if (dp[s] != null) {
            return dp[s];
        }

        int take = nums[s] + helper(nums, s + 2, e, dp);
        int notTake = helper(nums, s + 1, e, dp);

        return dp[s] = Math.max(take, notTake);
    }
}
