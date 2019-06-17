public class Solution {
    /**
     * @param nums: An array of integers
     * @return: An integer
     */
    public int maxProduct(int[] nums) {
        // write your code here
        if (nums.length == 0) {
            return 0 ;
        }
        
        int n = nums.length ; 
        
        int [] dpMax = new int [n] ; 
        int [] dpMin = new int [n] ; 
        
        int ans = nums[0];
        
        for (int i = 0 ; i < n ; ++ i) {
            if (i == 0) {
                dpMax[i] = nums[i] ; 
                dpMin[i] = nums [i] ; 
                continue ; 
            }
            
            dpMax[i] = Math.max ( nums[i] , Math.max(dpMax[i-1] * nums[i], dpMin[i-1] * nums[i]) ) ;
            dpMin[i] = Math.min (nums[i] , Math.min(dpMax[i-1] * nums[i], dpMin[i-1] * nums[i]) ) ; 
            
            if (dpMax[i] > ans) {
                ans = dpMax[i] ; 
            }
            
        }
        return ans ; 
        
    }
}