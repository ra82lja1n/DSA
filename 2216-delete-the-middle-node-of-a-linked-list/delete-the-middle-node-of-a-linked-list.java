/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode t1 = head;
        ListNode t2 = head;
        ListNode temp = new ListNode(0);
        while(t2 != null && t2.next != null){
            temp = t1;
            t1 = t1.next;
            t2 = t2.next.next;
        }

        System.out.println(t1.val);
        temp.next = temp.next.next;


        return head;

    }
}