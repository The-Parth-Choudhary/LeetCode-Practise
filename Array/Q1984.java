package Array;

import java.util.*;

public class Q1984 {
    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        System.out.println(minimumDifference(nums, 2));
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = k - 1;
        int min = Integer.MAX_VALUE;

        while (j < nums.length) {
            min = Math.min(min, nums[j] - nums[i]);
            i++;
            j++;
        }

        return min;
    }
}
