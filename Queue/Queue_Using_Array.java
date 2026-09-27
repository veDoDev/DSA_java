class myQueue 
{

   int front, size, n;
   int[] q;


    // Constructor
    public myQueue(int n) 
    {
        q = new int[n];
        front = 0;
        size = 0;
        this.n = n;
        // Define Data Structures
    }

    public boolean isEmpty() 
    {
        return (size == 0);
    }

    public boolean isFull() 
    {
        return size == n;
    }

    public void enqueue(int x) 
    {
        if(this.isFull())
            return;

        q[(front+size)%n] = x;
        size++;
    }

    public void dequeue() 
    {
        if(this.isEmpty())
            return;

        front++;
        size--;
    }

    public int getFront() 
    {
        if(this.isEmpty())
            return -1;

        return q[front];
    }

    public int getRear() 
    {
        if(this.isEmpty())
            return -1;

        return q[(front+size-1)%n];
    }
}
