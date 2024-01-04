package Array;

import java.util.*;

public class Q2870 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = 0;

        for (int k : map.keySet()) {
            int num = map.get(k);

            if (num == 1) {
                return -1;
            }

            ans += num / 3;

            if (num % 3 != 0) {
                ans++;
            }
        }

        return ans;
    }
}
