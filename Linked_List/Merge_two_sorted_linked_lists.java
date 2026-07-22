/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) 
    {
        Node merged = new Node(-1);
        
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node res = merged;
        
        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.data < ptr2.data)
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
