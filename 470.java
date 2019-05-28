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
     * @return: true if they are tweaked identical, or false.
     */
    public boolean isTweakedIdentical(TreeNode a, TreeNode b) {
        // write your code here
        return dfs(a, b) ; 
    }
    
    
    private boolean dfs(TreeNode a, TreeNode b) {
        if (a == null) {
            return b == null;
            
        }
        
        if (b == null) {
            return false ; 
        }
        
        if (a.val != b.val) {
            return false ;
        }
        
        
        if (dfs(a.left, b.left) ){
            
            return dfs(a.right, b.right) ; 
            
        } else if (dfs(a.left, b.right) ) {
            
            return dfs(a.right, b.left) ; 
            
        } else {
            
            return false ;
        }
        
        
    }
}