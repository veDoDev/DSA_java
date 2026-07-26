/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    public boolean isSorted(Node head) 
    {
        int dir = 0; // 0 -> nahi malum ||| 1 -> increasing ||| -1 -> decreasing
        
        while(head.next != null)
        {
            if(head.data < head.next.data)
            {
                if(dir == -1)
                    return false;
                
                dir = 1;
            }
            else if(head.data > head.next.data)
            {
                if(dir == 1)
                    return false;
                    
                dir = -1;
            }
            
            head = head.next;
        }
        
        return true;
    }
}
