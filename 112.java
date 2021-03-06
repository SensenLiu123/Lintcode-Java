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
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode node = head;
        
        while (node != null) {
            while (node.next != null && node.next.val == node.val) {
                node.next = node.next.next;
            }
            node = node.next ;
        }
        
        return head;
    }
}