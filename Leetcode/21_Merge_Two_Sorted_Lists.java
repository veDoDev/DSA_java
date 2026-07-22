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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode merged = new ListNode(-1);
        
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode res = merged;
        
        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.val < ptr2.val)
            {
                merged.next = ptr1;
                ptr1 = ptr1.next;
            }
            else
            {
                merged.next = ptr2;
                ptr2 = ptr2.next;
            }
            
            merged = merged.next;
        }
        
        while(ptr1 != null)
        {
            merged.next = ptr1;
            ptr1 = ptr1.next;
            merged = merged.next;
        }
        
        while(ptr2 != null)
        {
            merged.next = ptr2;
            ptr2 = ptr2.next;
            merged = merged.next;
        }
        // code here
        return res.next;           
    }
}
