package LinkedList;

public class Q82 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return head;
        }

        ListNode curr = head;
        boolean duplicate = false;

        while(curr != null && curr.next != null)
        {
            if(curr.val == curr.next.val)
            {
                duplicate = true;
                curr.next = curr.next.next;
            }
            else
            {
                if(duplicate)
                {
                    curr.val = curr.next.val;
                    curr.next = curr.next.next;
                    duplicate = false;
                }
                else
                {
                    curr = curr.next;
                }
            }
        }

        curr = head;

        if(duplicate)
        {
            if(curr.next == null)
            {
                return null;
            }

            while(curr.next.next != null)
            {
                curr = curr.next;
            }

            curr.next = null;
        }

        return head;
    }
}
