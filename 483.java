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
     * @param head: the head of linked list.
     * @return: An integer list
     */
    public List<Integer> toArrayList(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        
        ListNode node = head;
        
        while (node != null) {
            ans.add(node.val);
            node = node.next;
        }
        
        return ans ;
    }
}