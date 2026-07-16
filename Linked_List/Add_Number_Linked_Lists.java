/*
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
    public Node addTwoLists(Node head1, Node head2) 
    {
        Node rev1 = reverse(head1);
        Node rev2 = reverse(head2);
        Node res = new Node(-1);
        Node ans = res;
        int carry = 0;
        
        while(rev1 != null || rev2 != null || carry > 0)
        {
            int d1 = rev1 == null ? 0 : rev1.data;
            int d2 = rev2 == null ? 0 : rev2.data;
            
            int sum = d1 + d2 + carry;
            
            carry = sum/10;
            sum = sum%10;
                
            res.next = new Node(sum);
            
            res = res.next;
            
            rev1 = rev1 == null ? null : rev1.next;
            rev2 = rev2 == null ? null : rev2.next;
        }
            
        ans = ans.next;
        res = reverse(ans);
        while(res.next != null && res.data == 0)
            res = res.next;
        
        return res;
            
    }
    
    private Node reverse(Node head)
    {
       Node res = null;
       Node curr = head;
       Node temp = null;
       
       while(curr != null)
       {
           temp = curr.next;
           curr.next = res;
           res = curr;
           curr = temp;
       }
       
       return res;
    }
}
