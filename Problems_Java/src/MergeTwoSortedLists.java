//Problem
//https://leetcode.com/problems/merge-two-sorted-lists/submissions/

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
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(-1);
        ListNode head = current;
        
       while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
           current = current.next;
        }
        if(l1 == null){
            current.next = l2;
        }else{
            current.next = l1;
        }
        return head.next;
    }
}

//Linda Abundis