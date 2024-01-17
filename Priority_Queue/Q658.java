package Priority_Queue;

import java.util.*;

public class Q658 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, -1));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : arr) {
            if (k > 0) {
                minHeap.add(i);
                k--;
            } else if (Math.abs(minHeap.peek() - x) > Math.abs(i - x)) {
                minHeap.remove();
                minHeap.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            ans.add(minHeap.remove());
        }

        return ans;
    }
}
