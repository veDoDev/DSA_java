/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) 
    {
        if(head.next == null)
            return head;
            
        Node prev = head;
        Node curr = head.next;
        Node preserve = null;
        Node swappedEnd = null;
        head = curr;
        
        while(curr != null)
        {
            preserve = curr.next;
            prev.next = preserve;
            curr.next = prev;
            
            if(swappedEnd != null)
                swappedEnd.next = curr;
            swappedEnd = prev;
            
            prev = preserve;
            if(prev == null)
                break;
            curr = prev.next;
        }
        
        return head;
    }
}
