package LinkedList;

import java.util.*;

public class Q1171 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int sum = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0, temp);

        while (head != null) {
            sum += head.val;
            if (map.containsKey(sum)) {
                ListNode start = map.get(sum);
                ListNode remove = start;
                int currSum = sum;

                while (remove != head) {
                    remove = remove.next;
                    currSum += remove.val;
                    if (remove != head) {
                        map.remove(currSum);
                    }
                }
                start.next = head.next;
            } else {
                map.put(sum, head);
            }

            head = head.next;
        }

        return temp.next;
    }
}
