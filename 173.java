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
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(-1) ;
        
        ListNode node = head; 
        
        while (node != null) {
            ListNode cur = dummy ;
            
            while (cur.next!= null && cur.next.val < node.val) {
                cur = cur.next  ;
            }
            
            
            ListNode tmp = cur.next ;
            cur.next = new ListNode(node.val) ; 
            
            cur.next.next = tmp ; 
            
            
            node = node.next ;
        }
        
        return dummy.next ; 
    }
}