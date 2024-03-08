package Array;

import java.util.*;

public class Q3005 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }

        int cnt = 0;
        for (int curr : map.keySet()) {
            if (map.get(curr) == max) {
                cnt += max;
            }
        }

        return cnt;
    }
}
