/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) 
    {
        if(head.data > x)
        {
            Node res = new Node(x);
            
            res.next = head;
            head.prev = res;
            
            return res;
        }
        
        Node ptr = head;
        
        while(ptr != null)
        {
            if(ptr.data <= x)
            {
                if(ptr.next == null)
                {
                    Node add = new Node(x);
                    
                    ptr.next = add;
                    add.prev = ptr;
                    break;
                }
                ptr = ptr.next;
            }
            else
            {
                Node add = new Node(x);
                
                ptr.prev.next = add;
                add.prev = ptr.prev;
                add.next = ptr;
                ptr.prev = add;
                
                break;
            }
        }
        
        return head;
    }
}
