//------------------------------------------------------------------------------------------Approach 2 - delete the next node ------------------------------------------------------------------------------------------------
/* Structure of linked list Node
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node del_node) 
    {
        del_node.data = del_node.next.data;
        del_node.next = del_node.next.next;
    }
}
//------------------------------------------------------------------------------------------Approach 1 - traverse and delete the last-----------------------------------------------------------------------------------------
/* Structure of linked list Node
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node del_node) 
    {
        Node curr = del_node;
        
        while(curr != null)
        {
            curr.data = curr.next.data;
            if(curr.next.next == null)
            {
                curr.next = null;
                break;
            }
            
            curr = curr.next;
        }
    }
}
