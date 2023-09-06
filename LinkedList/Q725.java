package LinkedList;

public class Q725 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        ListNode node = head;
        int len = 0;

        while(node != null)
        {
            node = node.next;
            len++;
        }

        node = head;
        ListNode prev = null;
        int n = len / k;
        int r = len % k;

        for(int i = 0; node != null && i < k; i++, r--){
            ans[i] = node;

            int a = 0;

            if(r > 0)
            {
                a = 1;
            }

            for(int j = 0; j < n + a; j++){
                prev = node;
                node = node.next;
            }
            if(prev != null)
            {
                prev.next = null;
            }
        }

        return ans;
    }
}
