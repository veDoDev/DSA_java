/* Structure of linked list Node
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
    public Node joinLists(Node head1, Node head2) 
    {
        while(head1.next != null)
            head1 = head1.next;
        
        head1.next = head2;
        
        return head1;
    }
}
