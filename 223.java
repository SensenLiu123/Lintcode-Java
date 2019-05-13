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
     * @param head: A ListNode.
     * @return: A boolean.
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        ListNode middle = findMid(head); 
        
        middle.next = reverse(middle.next) ;
        
        ListNode left = head, right = middle.next ;
        
        while (right != null) {
            if (left.val != right.val) {
                return false ;
            }
            left = left.next ;
            right = right.next ;
        }
        return true;
        
    }
    
    
    private ListNode findMid(ListNode head) { 
        
        ListNode slow = head, fast = head.next ;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;
        }
        
        return slow ;
    }
    
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, node = head ;
        
        while (node != null ){
            ListNode future = node.next ;
            node.next = prev ;
            
            prev = node ;
            node = future ;
        }
        return prev ;
    }
}