/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) 
    {
        int i = 1;
        while(head.next != null)
        {
            head = head.next;
            i++;
        }
        
        return i;
    }
}
