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
     * @param root: the root of the binary tree
     * @return: An integer
     */
    private int ans = 0 ;  
    public int leafSum(TreeNode root) {

        dfs(root) ;
        
        return ans; 
    }
    
    
    private void dfs(TreeNode node) {
        if (node == null)  {
            return ;
        }
        
        if (node.left == null && node.right == null) {
            ans += node.val ;
            
        }
        
        dfs(node.left) ;
        dfs(node.right) ;
    }
}