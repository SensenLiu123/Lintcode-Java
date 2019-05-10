/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param nums: an integer array
     * @return: the first node of linked list
     */
    public ListNode toLinkedList(List<Integer> nums) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        ListNode node =  dummy;
        
        for (int num: nums) {
            ListNode newNode = new ListNode(num);
            node.next = newNode ;
            node = node.next;
        }
        
        return dummy.next;
    }
}