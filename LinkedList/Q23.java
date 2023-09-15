package LinkedList;

public class Q23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(Integer.MIN_VALUE);

        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];

            head = merge(head, temp);
        }

        return head.next;
    }

    private static ListNode merge(ListNode root1, ListNode root2){
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode node = head;

        while(root1 != null && root2 != null){
            if(root1.val < root2.val){
                node.next = root1;
                node = node.next;
                root1 = root1.next;
            }
            else{
                node.next = root2;
                node = node.next;
                root2 = root2.next;
            }
        }

        if(root1 != null){
            node.next = root1;
        }
        else{
            node.next = root2;
        }

        return head.next;
    }
}
