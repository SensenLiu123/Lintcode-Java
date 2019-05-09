/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        
        ListNode fast = head, slow = head; 
        
        for (int i = 0; i < n; ++i){
            fast = fast.next; 
            
            if (fast == null) {
                return head.next;
            }
            
        }
        
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        
        slow.next = slow.next.next;
        return head;
    }
}