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
    public int pairSum(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head.next;

        while(t2 != null && t2.next != null){
            t1 = t1.next;
            t2 = t2.next.next;
        }

        ListNode cut = t1.next;
        t1.next = null;


        ListNode rev = new ListNode(0);

        while(cut != null){
            ListNode temp = cut;
            cut = cut.next;
            temp.next = rev;
            rev = temp;
        }
        
        t1 = head;
        cut = rev;
        int max = Integer.MIN_VALUE;

        while(t1 != null){
            max = Math.max(max , (t1.val + cut.val));
            t1 = t1.next;
            cut = cut.next;
        }
        
        return max;
    }
}