package LinkedList;

public class Q148 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode h1 = head1;
        ListNode h2 = head2;

        ListNode ans = new ListNode();
        ListNode head = ans;

        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                head.next = new ListNode(h1.val);
                head = head.next;
                h1 = h1.next;
            }
            else{
                head.next = new ListNode(h2.val);
                head = head.next;
                h2 = h2.next;
            }
        }

        while(h1 != null){
            head.next = new ListNode(h1.val);
            head = head.next;
            h1 = h1.next;
        }

        while(h2 != null){
            head.next = new ListNode(h2.val);
            head = head.next;
            h2 = h2.next;
        }

        return ans.next;
    }

    public static ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        ListNode prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;
        return slow;
    }
}
