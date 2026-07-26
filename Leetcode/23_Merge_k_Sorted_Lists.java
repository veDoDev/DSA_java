//----------------------------------------------------------------------------------------------Approach 2 : priority queue ----------------------------------------------------------------------------------------------
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node:lists){
            if(node!=null)pq.add(node);
        }

        ListNode dummy= new ListNode();
        ListNode res=dummy;

        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            res.next=node;
            res=res.next;
            if(node.next!=null){
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }
}
//----------------------------------------------------------------------------------------------Approach 1 : sort --------------------------------------------------------------------------------------------------------
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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ArrayList<ListNode> res = new ArrayList<>();
        
        for(ListNode head : lists)
        {
            while(head != null)
            {
                res.add(head);
                head = head.next;
            }
        }
        
        Collections.sort(res, (a,b) -> { return Integer.compare(a.val,b.val); });
        
        ListNode ans = new ListNode(-1);
        ListNode ptr = ans;
        
        for(ListNode n : res)
        {
            ptr.next = n;
            ptr = ptr.next;
        }
        
        ptr.next = null;
        
        return ans.next;
        
    }
}
