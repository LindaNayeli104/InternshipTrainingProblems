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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode c = head.next;
        ListNode n = head.next.next;
         p.next = null;
        
        while(n != null){
            c.next = p;
            p = c;
            c = n;
            n = c.next;
        }
        
        c.next = p;
        head = c;
        return head;
    }
}
