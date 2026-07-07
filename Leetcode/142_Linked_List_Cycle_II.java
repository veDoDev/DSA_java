//--------------------------------------------------------------------------------------Approach 2:Temp vars------------------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                ListNode temp=head;
                while(temp!=s){
                    temp=temp.next;
                    s=s.next;
                }
                return temp;
            }
        }
        return null;
    }
}
//--------------------------------------------------------------------------------------Approach 1:HashMap--------------------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * class ListListListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null)
            return null;
        HashMap<ListNode,Integer> uniq = new HashMap<>();
        //find the ListNode which connects the loop + check if the loop exists
        ListNode ptr = head;
        int i = 1;
        
        while(ptr.next != null && !uniq.containsKey(ptr.next))
        {
            uniq.put(ptr, i);
            ptr = ptr.next;
            i++;
        }
        
        return ptr.next;
        
    }
}
