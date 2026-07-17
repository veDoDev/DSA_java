/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) 
    {
        Node end = head;
        Node kth = null;
        int i = 1;
        while(end != null)
        {
            if(i == k)
                kth = head;
            else if(i > k)
                kth = kth.next;
            
            end = end.next;
            i++;
        }
        
        if(kth == null)
            return -1;
        
        return kth.data;
    }
}
