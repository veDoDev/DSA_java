class MyStack {
    Queue<Integer> q;
    Queue<Integer> r;

    public MyStack() 
    {
        q = new LinkedList<>();
        r = new LinkedList<>();
    }
    
    public void push(int x) 
    {
        if(q.isEmpty())
        {
            q.offer(x);
            return;
        }
        
        while(!q.isEmpty())
            r.offer(q.poll());
            
        q.offer(x);
        
        while(!r.isEmpty())
            q.offer(r.poll());
    }
    
    public int pop() 
    {
        return q.poll();        
    }
    
    public int top() 
    {
        if(q.isEmpty())
            return -1;
            
        return q.peek();
    }
    
    public boolean empty() 
    {
        return q.isEmpty();        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
