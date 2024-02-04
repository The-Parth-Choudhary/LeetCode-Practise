package Priority_Queue;

import java.util.*;

public class Q703 {
    class KthLargest {
        PriorityQueue<Integer> minHeap;
        int k;

        public KthLargest(int k, int[] nums) {
            minHeap = new PriorityQueue<>();
            this.k = k;

            for (int i = 0; i < nums.length; i++) {
                add(nums[i]);
            }
        }

        public int add(int val) {
            minHeap.add(val);
            if (minHeap.size() > k) {
                minHeap.remove();
            }

            return minHeap.peek();
        }
    }
}
