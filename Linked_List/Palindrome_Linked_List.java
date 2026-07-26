/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) 
    {
        ArrayList<Integer> checker = new ArrayList<>();
        
        Node ptr = head;
        while(ptr != null)
        {
            checker.add(ptr.data);
            ptr = ptr.next;
        }
        
        int n = checker.size();
        
        for(int i = 0; i < n/2; i++)
        {
            int comp = n-i-1;
            
            if(  !checker.get(i).equals( checker.get(comp) )  )
                return false;
        }
        
        return true;
    }
}
