/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/

class Solution {
    Node removeDuplicates(Node head) 
    {
        Node ptr = head;
        Node prev = null;
        while(ptr != null)
        {
            int curr = ptr.data;
            prev = ptr;
            
            while(ptr != null && ptr.data == curr)
                ptr = ptr.next;
                
            prev.next = ptr;
            
            if(ptr == null)
                break;
        }

        return head;
    }
}  
