class Solution {
    public static int findMiddle(Node head) 
    {
        if(head.next == null)
            return head.data;
        
        Node aage = head;
        Node piche = head.prev;
        
        while(aage != piche)
        {
            aage = aage.next;
            piche = piche.prev;
        }
        
        return aage.data;
    }
};
