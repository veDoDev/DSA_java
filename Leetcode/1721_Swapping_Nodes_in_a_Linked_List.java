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
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode kth = null;
        int nodeCounter = 0;
        ListNode curr = head;
        ListNode kthComponent = null;
        
        while(curr != null)
        {
            nodeCounter++;
            if(nodeCounter == k)
            {
                kth = curr;
                kthComponent = head;
            }
                
            curr = curr.next;
            
            if(nodeCounter > k)
                kthComponent = kthComponent.next;
        }
        
        if(kth == null)
            return head;
            
        int temp = kth.val;
        kth.val = kthComponent.val;
        kthComponent.val = temp;
        
        return head;
    }
}
