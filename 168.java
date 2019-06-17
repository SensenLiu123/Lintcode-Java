public class Solution {
    /**
     * @param nums: A list of integer
     * @return: An integer, maximum coins
     */
    public int maxCoins(int[] nums) {
        int n = nums.length ;
        
        if (n == 0) {
            return 0 ; 
        }

        int i , j, k, len ; 
        int [] A = new int [n + 2] ;
        
        A[0] = 1 ;
        A[n + 1] = 1 ;
        
        for (i = 1; i <= n; ++ i) {
            A[i] = nums[i -1] ;
        }
        
        // 2 3 6 8
        // 1 2 3 6 8 1 
        
        int N = n + 2 ;
        int [][] dp = new int [N][N] ; 
        
        for (i = 0 ; i < N - 1 ;  ++ i) {
            dp[i][i + 1] = 0 ;
        }
        
        for (len = 3; len <= N ; ++len){
            for ( i = 0 ; i <= N - len ; ++ i) {
                j = i + len - 1  ; 
                dp[i][j] = 0 ;
                for (k = i + 1; k < j ; ++k) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + A[i] * A[k] * A[j] ) ; 
                }
            }
        }
        
        return dp[0][N - 1] ; 
    }
}