//---------------------------------------------------------------------------Approach 1 - copy next and delete next (pull)-----------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
//---------------------------------------------------------------------------Approach 2 - delete the last and copy rest--------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        ListNode curr = node;
        
        while(curr != null)
        {
            curr.val = curr.next.val;
            if(curr.next.next == null)
            {
                curr.next = null;
                break;
            }
            
            curr = curr.next;
        }
    }
}
