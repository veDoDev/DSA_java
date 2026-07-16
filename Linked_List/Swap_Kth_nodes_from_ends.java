/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) 
    {
        //kth Node
        Node kth = null;
        int nodeCounter = 0;
        Node curr = head;
        Node kthComponent = null;
        
        while(curr != null)
        {
            nodeCounter++;
            if(nodeCounter == k)
            {
                kth = curr;
                kthComponent = head;
            }
                
            curr = curr.next;
            
            if(nodeCounter > k)
                kthComponent = kthComponent.next;
        }
        
        
        if(kth == null)
            return head;
            
        int temp = kth.data;
        kth.data = kthComponent.data;
        kthComponent.data = temp;
        
        return head;
    }
}
     
