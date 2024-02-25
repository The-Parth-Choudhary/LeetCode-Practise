package Priority_Queue;

import java.util.*;

public class Q347 {

    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            minHeap.add(new Pair(ele.getKey(), ele.getValue()));

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        int[] ans = new int[k];
        int i = 0;

        while (!minHeap.isEmpty()) {
            ans[i++] = minHeap.remove().key;
        }

        return ans;
    }
}
