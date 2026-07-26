/* Structure of Linked List Node
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
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node ptr = head;
        
        while(ptr != null)
        {
            Node temp = ptr.next;
            
            ptr.next = prev;
            prev = ptr;
            
            ptr = temp;
        }
        
        return prev;
    }
}
