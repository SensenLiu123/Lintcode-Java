class ListNode {
    public int val ;
    public ListNode next ;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MyQueue {
    
    private ListNode dummy = new ListNode(-1) ;
    private ListNode tail = dummy ;
    
    
    /*
     * @param item: An integer
     * @return: nothing
     */
     
     
    public void enqueue(int item) {
        tail.next = new ListNode(item);
        tail = tail.next ;
        
        return;
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        if (dummy.next == null) {
            return -1 ;
        } 
        
        if (dummy.next == tail) {
            tail = dummy ; 
        }
        
        int ans = dummy.next.val ;
        
        dummy.next  = dummy.next.next ;
        
        return ans ;
    }
}