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
     * @return: head of the linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode prev = dummy;
        ListNode node = head; 

        
        while (node != null && node.next != null) {
            
            if (node.next != null && node.val != node.next.val) {
                node = node.next; 
                prev = prev.next;
            } else {
                while (node.next != null && node.val == node.next.val){
                    node.next = node.next.next ;
                }
                node = node.next;
                prev.next = prev.next.next;
            }
        }
        return dummy.next ;
    }
}