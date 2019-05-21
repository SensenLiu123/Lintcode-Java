import java.util.* ;
interface InterfaceQueue {
    void push(int val);

    // define an interface for pop method
    /* write your code here */
    int pop() ; 

    // define an interface for top method
    /* write your code here */
    
    int top() ;
}

public class MyQueue implements InterfaceQueue{
    Queue <Integer> queue ; 
    
    public MyQueue() {
        // do intialization if necessary
        this.queue = new LinkedList<Integer> ();
    }

    // implement the push method
    @ Override
    public void push (int val) { 
        queue.offer(val) ;
    }
    

    @Override
    public int pop() {
        // write your code here
        return  queue.poll() ; 
    }

    @Override
    public int top() {
        // write your code here
        return queue.peek() ; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */