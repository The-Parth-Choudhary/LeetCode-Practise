package LinkedList;

public class Q24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode node) {
        if(node == null || node.next == null){
            return node;
        }

        ListNode curr = node;
        ListNode next = node.next;

        ListNode temp = swapPairs(next.next);

        curr.next = temp;
        next.next = curr;

        return next;
    }
}
