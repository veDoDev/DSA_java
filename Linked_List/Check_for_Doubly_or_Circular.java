/*class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}*/

class Solution {
    public static boolean isCircular(Node head) 
    {
        if(head.next == null)
            return false;
            
        Node ptr = head.next;
        
        while(ptr != null)
        {
            if(ptr == head)
                return true;
            
            ptr = ptr.next;
        }
        
        return false;
    }
};
