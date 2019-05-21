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
     * @param level: the depth of the target level
     * @return: An integer
     */
     
    private int sum = 0 ; 
    public int levelSum(TreeNode root, int level) {
        
        dfs(root, 1, level) ;
        
        return sum ; 
    }
    
    
    private void dfs(TreeNode node, int curLvl, int level ) {
        
        if (node == null || curLvl > level) {
            return ; 
        
        }
        
        if (curLvl == level) {
            sum += node.val ;
        }
        
        dfs(node.left, curLvl + 1, level) ;
        dfs(node.right, curLvl + 1, level) ;
    }
}