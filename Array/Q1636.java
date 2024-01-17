package Array;

import java.util.*;

public class Q1636 {
    public static void main(String[] args) {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Collections.sort(list, (a, b) ->
                (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b)
        );

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}
