package Array;

public class Q713 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int mul = nums[0];
        int cnt = 0;

        while (j < nums.length && i < nums.length) {
            if (mul < k) {
                j++;
                if (j >= i) {
                    cnt += j - i;
                }
                if (j < nums.length) {
                    mul *= nums[j];
                }
            } else {
                mul /= nums[i];
                i++;
            }
        }

        return cnt;
    }
}
