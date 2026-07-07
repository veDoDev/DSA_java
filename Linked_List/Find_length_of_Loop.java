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
    public int lengthOfLoop(Node head) 
    {
        HashMap<Node,Integer> uniq = new HashMap<>();
        //find the node which connects the loop + check if the loop exists
        Node ptr = head;
        int i = 1;
        
        while(ptr.next != null && !uniq.containsKey(ptr.next))
        {
            uniq.put(ptr, i);
            ptr = ptr.next;
            
            i++;
        }
        
        if(ptr.next == null)
            return 0;
        
        return i - uniq.get(ptr.next) + 1;
    }
}
