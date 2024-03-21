package LinkedList;

public class Q1669 {
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list1;

        while (a > 1) {
            curr1 = curr1.next;
            a--;
        }

        while (b != -1) {
            curr2 = curr2.next;
            b--;
        }

        curr1.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = curr2;

        return list1;
    }
}
