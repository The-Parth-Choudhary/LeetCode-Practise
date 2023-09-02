package LinkedList;



public class Q2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode ansHead = new ListNode(-1);
        ListNode anstail = ansHead;
        while(curr1 != null && curr2 != null){
            int ele = curr1.val+curr2.val+carry;
            anstail=insert(anstail,ele%10);
            carry=ele/10;
            curr1=curr1.next;
            curr2=curr2.next;
        }

        while(curr1!=null){
            int ele = curr1.val+carry;
            anstail=insert(anstail,ele%10);
            carry=ele/10;
            curr1=curr1.next;
        }

        while(curr2!=null){
            int ele = curr2.val+carry;
            anstail=insert(anstail,ele%10);
            carry=ele/10;
            curr2=curr2.next;
        }
        while(carry>0){
            anstail=insert(anstail,carry%10);
            carry=carry/10;
        }

        return ansHead.next;
    }
    static ListNode insert(ListNode tail,int ele){
        ListNode temp=new ListNode(ele);
        tail.next=temp;
        tail=temp;
        return tail;
    }
}
