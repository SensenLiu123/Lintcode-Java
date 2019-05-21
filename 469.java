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
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        
        return dfs(a, b) ; 
        
    }
    
    private boolean dfs(TreeNode a, TreeNode b)  {
        if (a == null) {
            return b == null ; 
        }
        
        if (b == null) {
            return a == null ;
        }
        
        
        if (a.val != b.val) {
            return false ;
        }
        
        
        boolean subTreeLeft = dfs(a.left, b.left) ; 
        if (!subTreeLeft ) {
            return false ;
        } else {
            return dfs(a.right, b.right) ;
        }
        
         
    }
}