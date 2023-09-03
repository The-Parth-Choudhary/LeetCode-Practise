package LinkedList;

public class Q147 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head) {
        if(head == null)
        {
            return head;
        }

        ListNode helper = new ListNode(0);
        ListNode curr = head;
        ListNode prev = helper;
        ListNode next = null;

        while(curr != null)
        {
            next = curr.next;

            while(prev.next != null && prev.next.val < curr.val)
            {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            prev = helper;
            curr = next;
        }

        return helper.next;
    }
}
