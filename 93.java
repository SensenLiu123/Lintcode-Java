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
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true ;
        }
        
        if (!isBalanced(root.left) || !isBalanced(root.right) ) {
            return false ;
        }
        
        int leftHeight = getHeight(root.left) ; 
        int rightHeight = getHeight(root.right) ;
        
        return Math.abs(leftHeight - rightHeight) <=1 ;
        
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0 ;
        }
        
        int left = getHeight(node.left) ;
        int right = getHeight(node.right) ;
        
        return Math.max(left, right) + 1 ;
        
    }
}