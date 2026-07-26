/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) 
    {
        if(x == 1)
        {
            if(head.next != null)
                head.next.prev = null;
                
            return head.next;
        }
            
        int i = 1;
        Node ptr = head;
        
        while(ptr != null)
        {
            if(i == x)
            {
                ptr.prev.next = ptr.next;
                
                if(ptr.next != null)
                    ptr.next.prev = ptr.prev;
                    
                return head;
            }
            
            ptr = ptr.next;
            i++;
        }
        
        return head;
    }
}
