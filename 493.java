class ListNode {
    int val ; 
    ListNode next ;
    ListNode prev ; 
    public ListNode (int val) {
        this.val = val ;
        this.next = null ;
        this.prev = null ;
    }
}

public class Dequeue {
    ListNode dummy ; 
    ListNode tail ; 
    public Dequeue() {
        dummy = new ListNode(-1) ; 
        tail = dummy ;
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_front(int item) {
        if (dummy.next == null) {
            push_back(item) ;
            return ;
        }
        
        ListNode newNode = new ListNode(item) ; 
        ListNode head = dummy.next ;
        
        dummy.next = newNode ;
        newNode.next = head ;
        head.prev = newNode ;
        newNode.prev = dummy ; 
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void push_back(int item) {
        ListNode newNode = new ListNode(item) ; 
        tail.next = newNode ; 
        newNode.prev = tail ; 
        
        tail = tail.next ;
    }

    /*
     * @return: An integer
     */
    public int pop_front() {
        if (dummy.next == null) {
            return -1 ; 
        }
        
        int ans = dummy.next.val ;
        
        if (dummy.next == tail) {
            tail = dummy ; 
            dummy.next = null ;
        } else {
            dummy.next = dummy.next.next ;
            dummy.next.prev = dummy ;
            
        }
        
        return ans ;
    }

    /*
     * @return: An integer
     */
    public int pop_back() {
        if (dummy == tail) {
            return -1 ;
        }
        
        int ans = tail.val ; 
        
        tail = tail.prev ; 
        tail.next = null ; 
        
        return ans ; 
    }
}