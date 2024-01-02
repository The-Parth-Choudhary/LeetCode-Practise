package Array;

import java.util.*;

public class Q2610 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(nums));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        while (!map.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            List<Integer> keyToRemove = new ArrayList<>();

            for (int i : map.keySet()) {
                list.add(i);

                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    keyToRemove.add(i);
                }
            }

            for (int i : keyToRemove) {
                map.remove(i);
            }

            ans.add(list);
        }

        return ans;
    }
}
