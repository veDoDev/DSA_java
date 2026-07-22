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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
            
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode preserve = null;
        ListNode swappedEnd = null;
        head = curr;
        
        while(curr != null)
        {
            preserve = curr.next;
            prev.next = preserve;
            curr.next = prev;
            
            if(swappedEnd != null)
                swappedEnd.next = curr;
            swappedEnd = prev;
            
            prev = preserve;
            if(prev == null)
                break;
            curr = prev.next;
        }
        
        return head;
    }
}
