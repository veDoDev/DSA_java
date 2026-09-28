class myStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> r = new LinkedList<>();

    void push(int x) 
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
        // Inserts an element x at the top of the stack
    }

    void pop() 
    {
        q.poll();
        // Removes an element from the top of the stack
    }

    int top() 
    {
        if(q.isEmpty())
            return -1;

        return q.peek();
        // Returns the top element of the stack
        // If stack is empty, return -1
    }

    int size() 
    {
        return q.size();
        // Returns the current size of the stack
    }
}
