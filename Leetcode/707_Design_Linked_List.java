class Node{
    int val;
    Node next;

    Node(){}

    Node(int val)
    {
        this.val = val;
    }
    
    Node(int val, Node next)
    {
        this.val = val;
        this.next = next;
    }
}
class MyLinkedList 
{
    Node head;

    public MyLinkedList() 
    {
        head = null;        
    }
    
    public int get(int index) 
    {
        Node ptr = head;
        int idx = 0;

        while(ptr != null && idx < index)
        {
            ptr = ptr.next;
            idx++;
        }

        if(ptr == null)
            return -1;

        return ptr.val;   
    }
    
    public void addAtHead(int val) 
    {
        Node temp = new Node(val, head);
        head = temp;
    }
    
    public void addAtTail(int val) 
    {
        if(head == null)
        {
            head = new Node(val);
            return;
        }

        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }

        Node temp = new Node(val);
        ptr.next = temp;        
    }
    
    public void addAtIndex(int index, int val) 
    {
        if(index == 0)
        {
            Node temp = new Node(val);

            temp.next = head;
            head = temp;

            return;
        }

        if(head == null)
            return;

        Node ptr = head;
        int idx = 0;

        while(ptr.next != null && idx+1 < index)
        {
            ptr = ptr.next;
            idx++;
        }

        if(ptr.next == null && idx+1 < index)
            return;

        Node temp = new Node(val);
        temp.next = ptr.next;
        ptr.next = temp;
    }
    
    public void deleteAtIndex(int index) 
    {
        if(head == null)
            return;

        if(index == 0)
        {
            head = head.next;
            return;
        }

        Node ptr = head;
        int idx = 0;

        while(ptr.next != null && idx+1 < index)
        {
            ptr = ptr.next;
            idx++;
        }

        if(ptr.next == null || idx+1 < index)
            return;

        ptr.next = ptr.next.next;                        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
