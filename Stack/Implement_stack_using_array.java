class myStack 
{
    int top = -1;
    int cap;
    int[] ele;

    public myStack(int n) 
    {
        cap = n;
        ele = new int[n];
        // Define Data Structures
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }

    public boolean isFull() 
    {
        return (top+1 == cap);
    }

    public void push(int x) 
    {
        if(this.isFull())
            return;
            
        ele[++top] = x;
        // Inserts x at the top of the stack
    }

    public void pop() 
    {
        if(this.isEmpty())
            return;
        
        top--;
        // Removes an element from the top of the stack
    }

    public int peek() 
    {
        if(top != -1)
            return ele[top];
            
        return -1;
        // Returns the top element of the stack
    }
}
