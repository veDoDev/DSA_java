/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack 
{
    int top = -1;
    Node head;
    

    public myStack() 
    {
        head = null;
        // Initialize your data members
    }

    public boolean isEmpty() 
    {
        return top == -1;
        // check if the stack is empty
    }

    public void push(int x) 
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        top++;
        // Adds an element x at the rear of the stack.
    }

    public void pop() 
    {
        if(top == -1)
            return;
        top--;
        head = head.next;
        // Removes the front element of the stack.
    }

    public int peek() 
    {
        if(top == -1)
            return -1;
            
        return head.data;
        // Returns the front element of the stack.
        // If stack is empty, return -1.
    }

    public int size() 
    {
        return top+1;
        // Returns the current size of the stack.
    }
}
