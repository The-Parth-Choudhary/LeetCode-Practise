package LinkedList;

public class Q19 {
        public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }

        int size = 0;

        ListNode node = head;

        while(node != null){
            node = node.next;
            size++;
        }

        n = size - n + 1;
        size = 0;

        ListNode curr = head;
        ListNode prev = null;

        while(size < n - 1){
            prev = curr;
            curr = curr.next;
            size++;
        }

        if(curr == head){
            head = head.next;
            return head;
        }

        prev.next = curr.next;

        return head;
    }
}
