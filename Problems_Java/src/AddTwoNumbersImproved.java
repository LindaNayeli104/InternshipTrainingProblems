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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while(l1 != null || l2 != null){
            val1 = (l1 == null) ? 0 : l1.val;
            val2 = (l2 == null) ? 0 : l2.val;
            res = val1 + val2 + carry;
            carry = res / 10;
            res = res % 10;
    
            ListNode l3 = new ListNode(res);
            dummy.next = l3;
            dummy = dummy.next;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry > 0){
            ListNode l3 = new ListNode(carry);
            dummy.next = l3;
        }  
        return head.next;
    }
}