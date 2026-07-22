//----------------------------------------------------------------------------------------------Approach 2 : Intution-----------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        while(ptr1 != ptr2)
        {
            ptr1 = ptr1 == null ? headB : ptr1.next;
            ptr2 = ptr2 == null ? headA : ptr2.next;
        }
        
        return ptr2;
    }
}
//----------------------------------------------------------------------------------------------Approach 1 : HashSet------------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        HashSet<ListNode> hashA = new HashSet<>();

        ListNode ptr = headA;
        while(ptr != null)
        {
            hashA.add(ptr);
            ptr = ptr.next;
        }

        ptr = headB;
        while(ptr != null)
        {
            if(hashA.contains(ptr))
                return ptr;
            
            ptr = ptr.next;
        }

        return null;
    }
}
