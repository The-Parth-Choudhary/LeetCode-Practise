package Dynamic_Programming;

public class Q746 {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] arr) {
        Integer[] dp = new Integer[arr.length];

        return Math.min(helper(arr, 0, dp), helper(arr, 1, dp));
    }

    private static int helper(int[] arr, int index, Integer[] dp) {
        if (index >= arr.length) {
            return 0;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        return dp[index] = arr[index] + Math.min(helper(arr, index + 1, dp), helper(arr, index + 2, dp));
    }
}
