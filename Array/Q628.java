package Array;

import java.util.*;

public class Q628 {
    public static void main(String[] args) {
        int[] nums = {-100, -98, -1, 2, 3, 4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length - 1;
        int num1 = nums[n] * nums[n - 1] * nums[n - 2];
        int num2 = nums[0] * nums[1] * nums[n];
        return Math.max(num1, num2);
    }
}
