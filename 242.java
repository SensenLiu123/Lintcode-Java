/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param root the root of binary tree
     * @return a lists of linked list
     */
    public List<ListNode> binaryTreeToLists(TreeNode root) {
        List<ListNode> ans = new ArrayList<>() ; 
        
        if (root == null) {
            return ans ;
        }
        
        Queue<TreeNode> queue = new LinkedList<>(); 
        
        queue.offer(root) ;
        while (!queue.isEmpty()) {
            int n = queue.size();
            
            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy ; 
            
            for (int i = 0; i < n ; ++ i) {
                TreeNode cur = queue.poll(); 
                
                tail.next = new ListNode(cur.val) ; 
                
                tail = tail.next ;
                
                if (cur.left != null) {
                    queue.offer(cur.left) ;
                }
                
                if (cur.right != null) {
                    queue.offer(cur.right) ;
                }
                
                
            }
            
            ans.add(dummy.next ) ;
        }
        return ans ;
    }
}