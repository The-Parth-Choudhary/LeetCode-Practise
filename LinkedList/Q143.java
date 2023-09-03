package LinkedList;

public class Q143 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = getMid(head);

        ListNode h2 = reverse(mid);
        ListNode h1 = head;

        while(h1 != null && h2 != null){
            ListNode temp = h1.next;
            h1.next = h2;
            h1 = temp;

            temp = h2.next;
            h2.next = h1;
            h2 = temp;
        }

        if(h1 != null){
            h1.next = null;
        }
    }

    private ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
