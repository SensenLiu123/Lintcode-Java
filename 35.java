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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode prev = null;
        ListNode node = head;
        while (node != null) {
            ListNode future = node.next ;
            
            node.next = prev;
            
            prev = node;
            node = future;
        }
        
        return prev;
    }
}