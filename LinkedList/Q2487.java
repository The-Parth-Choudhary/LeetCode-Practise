package LinkedList;

import java.util.*;

public class Q2487 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode reverse = reverse(head);

        while(reverse != null){
            if(s.isEmpty() ||  reverse.val >= s.peek()){
                s.push(reverse.val);
            }
            reverse = reverse.next;
        }

        ListNode newHead = new ListNode(0);
        ListNode node = newHead;

        while(!s.isEmpty()){
            ListNode temp = new ListNode(s.pop());
            node.next = temp;
            node = node.next;
        }

        return newHead.next;
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
