class MyQueue {
    Stack<Integer> stack;

    public MyQueue() 
    {
        stack = new Stack<>();    
    }
    
    public void push(int x) 
    {
        if(stack.isEmpty())
            stack.push(x);
        else
        {
            int curr = stack.pop();
            this.push(x);
            stack.push(curr);
        }
        
    }
    
    public int pop() 
    {
        return stack.pop();
    }
    
    public int peek() 
    {
        if(stack.isEmpty())
            return -1;
        return stack.peek();
    }
    
    public boolean empty() 
    {
        return stack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
