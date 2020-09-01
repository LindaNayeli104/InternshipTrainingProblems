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
class MergeTwoSortedLists{
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1.val != null || l2.val != null){
            if(l1.val == null){
                return l2;
            }else{
                return l1;
            }
        }
        LinkedList<Integer> ll_res = new LinkedList<>();
        ListNode current_l1 = l1.header;
        ListNode current_l2 = l2.header;
       while(current_l1.next != null || current_l2next != null){
            if(current_l1.val < current_l2.val){
                ll_res.add(current_l1);
                if(current_l1.next != null){
                    current_l1 = current_l1.next;
                }else{
                    current_l1 = new ListNode(Integer.MAX_VALUE, null);
                }
            }else{
                ll_res.add(current_l2);
                if(current_l2.next != null){
                    current_l2 = current_l2.next;
                }else{
                    current_l2 = new ListNode(Integer.MAX_VALUE, null);
                }
            }
       }
        return ll_res.header;
    }
}