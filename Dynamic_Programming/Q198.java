package Dynamic_Programming;

public class Q198 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return helper(nums, nums.length-1, dp);
    }

    private static int helper(int[] nums, int n, Integer[] dp) {
        if(n == 0){
            return nums[0];
        }
        if(n < 0){
            return 0;
        }

        if(dp[n] != null){
            return dp[n];
        }

        int take = nums[n] + helper(nums, n-2, dp);
        int notTake = helper(nums, n-1, dp);

        return dp[n] = Math.max(take, notTake);
    }
}
