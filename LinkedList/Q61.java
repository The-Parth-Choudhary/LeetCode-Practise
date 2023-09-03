package LinkedList;

public class Q61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }

        ListNode tail = head;
        int len = 1;

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        tail.next = head;

        int rotation = k % len;
        int skip = len - rotation;

        ListNode newLast = head;

        for(int i = 0; i < skip - 1; i++){
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
