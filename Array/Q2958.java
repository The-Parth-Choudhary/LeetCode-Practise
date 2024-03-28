package Array;

import java.util.*;

public class Q2958 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        System.out.println(maxSubarrayLength(nums, 2));
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < nums.length) {
            if (!map.containsKey(nums[j])) {
                map.put(nums[j], 1);
                j++;
            } else {
                if (map.get(nums[j]) < k) {
                    map.put(nums[j], map.get(nums[j]) + 1);
                    j++;
                } else {
                    map.put(nums[i], map.get(nums[i]) - 1);
                    if (map.get(nums[i]) == 0) {
                        map.remove(nums[i]);
                    }
                    i++;
                }
            }
            max = Math.max(max, j - i);
        }

        return max;
    }
}
