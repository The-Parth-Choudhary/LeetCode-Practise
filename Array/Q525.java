package Array;

import java.util.*;

public class Q525 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (sum == 0) {
                ans = i + 1;
            } else if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return ans;
    }
}
