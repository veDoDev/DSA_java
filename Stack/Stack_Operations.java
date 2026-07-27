class myStack {
    ArrayList<Integer> s = new ArrayList<>();
    int top = -1;

    public void push(int x) 
    {
        s.add(x);
        top++;
        // insert x into stack
    }

    public void pop() 
    {
        if(top == -1)
            return;
            
            
        s.remove(top);
        top--;
        // remove top ele from stack
    }

    public int peek() 
    {
        if(top == -1)
            return -1;
            
        return s.get(top);
        // return top of stack
    }

    public int getSize() 
    {
        return top+1;
        // return current size of stack
    }

    public boolean isEmpty() 
    {
        return top == -1;
        // check whether stack is empty
    }
}
