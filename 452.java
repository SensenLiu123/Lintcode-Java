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
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        
        ListNode node = head;
        
        ListNode newNode = new ListNode(-1), dummy = newNode;
        
        while (node != null) {
            if (node.val != val) {
                newNode.next = new ListNode(node.val);
                newNode = newNode.next ;
            } 
            
            node = node.next;
        }
        
        return dummy.next;
    }
}