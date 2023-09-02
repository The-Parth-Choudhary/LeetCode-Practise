package LinkedList;

public class Q1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
        head = reverse(head);

        int ans = 0;
        int cnt=0;

        while(head != null){
            ans+= (int) (head.val * Math.pow(2, cnt++));
            head = head.next;
        }

        return ans;
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return temp;
    }
}
