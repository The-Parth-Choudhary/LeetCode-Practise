package Array;

import java.util.*;

public class Q1207 {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (set.contains(ele.getValue())) {
                return false;
            }

            set.add(ele.getValue());
        }

        return true;
    }
}
