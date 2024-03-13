package Array;

public class Q1493 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int max = 0;
        boolean deleted = false;
        int from = 0;

        while (j < nums.length) {
            if (nums[j] == 1) {
                j++;
                max = Math.max(max, j - i);
            } else if (!deleted) {
                j++;
                deleted = true;
                max = Math.max(max, j - i);
            } else {
                if (nums[i] == 0) {
                    deleted = false;
                }
                i++;
            }
        }

        return max - 1;
    }
}
