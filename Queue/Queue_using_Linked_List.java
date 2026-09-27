// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
    
    Node front;
    Node rear;
    int size;
    
    public myQueue() 
    {
        size = 0;
        // Initialize your data members
    }

    public boolean isEmpty() 
    {
        return front == null;
        // check if the queue is empty
    }

    public void enqueue(int x) 
    {
        if(this.isEmpty())
        {
            front = new Node(x);
            rear = front;
            size++;
            return;
        }
        
        rear.next = new Node(x);
        rear = rear.next;
        size++;
        // Adds an element x at the rear of the queue.
    }

    public void dequeue() 
    {
        if(this.isEmpty())
            return;
            
        front = front.next;
        size--;
        // Removes the front element of the queue
    }

    public int getFront() 
    {
        if(this.isEmpty())
            return -1;
        
        return front.data;
        // Returns the front element of the queue.
        // If queue is empty, return -1.
    }

    public int size() 
    {
        return size;
        // Returns the current size of the queue.
    }
}
