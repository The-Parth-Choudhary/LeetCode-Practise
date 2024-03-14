package Array;

import java.util.*;

public class Q930 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        System.out.println(numSubarraysWithSum(nums, 2));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - goal)) {
                cnt += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
