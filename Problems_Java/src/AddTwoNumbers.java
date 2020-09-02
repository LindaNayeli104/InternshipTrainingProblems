//Problem
//https://leetcode.com/problems/add-two-numbers/

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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        int carry = 0;
        ListNode sum = new ListNode(-1);
        ListNode head = sum;
        
        
       while(l1 != null && l2 != null){
           res = (l1.val +l2.val + carry) % 10;
           carry = (l1.val + l2.val + carry) / 10;
          
           sum.next = new ListNode(res);
           l1 = l1.next;
           l2 = l2.next;
           sum = sum.next;
       }
        
        
        if(l1 == null && l2 != null){
            if(carry > 0){
                 while(carry > 0 && l2 != null ){
                   res = (l2.val + carry) % 10;
                   carry = (l2.val + carry) / 10;
                   sum.next = new ListNode(res);
                   l2 = l2.next;
                   sum = sum.next;   
               }
            }
            sum.next = l2;
            
        }else if(l2 == null && l1 != null){
            if(carry > 0){
                while(carry > 0 && l1 != null){
                   res = (l1.val + carry) % 10;
                   carry = (l1.val + carry) / 10;
                   sum.next = new ListNode(res);
                   l1 = l1.next;
                   sum = sum.next;   
               }
            }
            sum.next = l1;
            
        }
        
        if(carry > 0){
            sum.next = new ListNode(carry);
        }
        return head.next;
    }
}

//Linda Abundis