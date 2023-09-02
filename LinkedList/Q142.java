package LinkedList;

public class Q142 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        fast = head;
        slow = head;

        while(length > 0){
            fast = fast.next;
            length--;
        }

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    private int cycleLength(ListNode head){
        ListNode node = head;
        int length = 0;

        do{
            node = node.next;
            length++;
        }while(node != head);

        return length;
    }
}