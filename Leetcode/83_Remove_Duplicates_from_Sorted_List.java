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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode ptr = head;
        ListNode prev = null;
        
        while(ptr != null)
        {
            int curr = ptr.val;
            prev = ptr;
            
            while(ptr != null && ptr.val == curr)
                ptr = ptr.next;
                
            prev.next = ptr;
            
            if(ptr == null)
                break;
        }

        return head;
        
    }
}
