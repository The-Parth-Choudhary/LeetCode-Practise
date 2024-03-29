package Array;

public class Q2962 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 3};
        System.out.println(countSubarrays(nums, 2));
    }

    public static long countSubarrays(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int i = 0;
        int j = 0;
        int cnt = 0;
        long ans = 0;

        while (j < nums.length) {
            if (nums[j] == max) {
                cnt++;
            }
            while (cnt >= k) {
                if (nums[i] == max) {
                    cnt--;
                }
                i++;
                ans += nums.length - j;
            }
            j++;
        }

        return ans;
    }
}
