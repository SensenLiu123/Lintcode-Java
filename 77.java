public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: The length of longest common subsequence of A and B
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        if (A == null || B == null) {
            return 0 ;
        }
        
        int m = A.length(), n = B.length() ; 
        
        
        
        if (m == 0 || n == 0) {
            return 0 ; 
        }
        
        int [] [] dp = new int [m + 1] [ n + 1] ; 
        
        for ( int i = 0 ;  i < m + 1 ; ++i) {
            for (int j = 0 ;  j < n + 1; ++j) {
                if (i == 0 || j == 0) {
                    continue ; 
                }
                
                dp[i] [j] = Math.max(dp[i - 1] [j], dp[i] [j - 1]) ; 
                
                if ( A.charAt(i - 1) == B.charAt(j - 1 ) ) {
                    dp[i] [j] = Math.max(dp[i] [j] , dp[i - 1] [j - 1] + 1 ) ; 
                }
            }
        }
        
        return dp[m] [n] ; 
    }
}