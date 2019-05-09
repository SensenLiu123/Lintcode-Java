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
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        
        if (l2 == null) {
            return l1; 
        }
        
        ListNode dummy = new ListNode(-1), node = dummy;
        ListNode node1 = l1, node2 = l2; 
        
        while (node1 != null && node2 != null){
            if (node1.val <= node2.val){
                node.next = node1;
                node1 = node1.next;
                
            } else {
                node.next = node2;
                node2 = node2.next;
            }
            
            node = node.next;
        }
        
        while (node1 != null) {
            node.next = node1;
            node1 = node1.next;
            node = node.next ;
        }
        
        while (node2 != null) {
            node.next = node2;
            node2 = node2.next;
            node = node.next; 
        }
        
        return dummy.next;
    }
}