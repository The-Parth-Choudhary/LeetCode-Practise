package Priority_Queue;

import java.math.*;
import java.util.*;

public class Q1985 {
    public static void main(String[] args) {
        String[] nums = {"683339452288515879", "7846081062003424420", "4805719838",
                "4840666580043", "83598933472122816064", "522940572025909479",
                "615832818268861533", "65439878015", "499305616484085", "97704358112880133",
                "23861207501102"};

        System.out.println(kthLargestNumber(nums, 3));
    }

    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            minHeap.add(new BigInteger(nums[i]));

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        return minHeap.peek().toString();
    }
}
