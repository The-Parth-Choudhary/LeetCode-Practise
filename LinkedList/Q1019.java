package LinkedList;
import java.util.*;
public class Q1019 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nextLargerNodes(ListNode head) {
        head = reverse(head);
        ListNode node = head;
        int size = size(head);
        int[] ans = new int[size];
        int i = size - 1;
        Stack<Integer> s = new Stack<>();
        s.push(0);

        while(node != null)
        {
            while(s.peek() != 0 && s.peek() <= node.val)
            {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(node.val);
            i--;
            node = node.next;
        }

        return ans;
    }

    private int size(ListNode head){
        int size = 0;

        while(head != null)
        {
            head = head.next;
            size++;
        }

        return size;
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;


        return temp;
    }
}
