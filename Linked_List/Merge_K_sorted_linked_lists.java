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
    Node mergeKLists(Node[] arr) 
    {
        ArrayList<Node> res = new ArrayList<>();
        
        for(Node head : arr)
        {
            while(head != null)
            {
                res.add(head);
                head = head.next;
            }
        }
        
        Collections.sort(res, (a,b) -> { return Integer.compare(a.data,b.data); });
        
        Node ans = new Node(-1);
        Node ptr = ans;
        
        for(Node n : res)
        {
            ptr.next = n;
            ptr = ptr.next;
        }
        
        ptr.next = null;
        
        return ans.next;
    }
}
