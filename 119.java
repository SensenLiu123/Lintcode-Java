public class Solution {
    /**
     * @param word1: A string
     * @param word2: A string
     * @return: The minimum number of steps.
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length() ; 
        
        if (m == 0) {
            return n ; 
        }
        
        if (n == 0) {
            return m ; 
        }
        
        int [][] dp = new int[m + 1][n + 1] ;
        
        int i, j ; 

        for ( i = 0; i < m + 1 ; ++ i  ) {
            dp[i][0] = i ; 
        }
        
        for (j = 0; j < n + 1 ; ++ j) {
            dp[0][j] = j ;
        }
        
        for (i = 1 ; i < m + 1 ; ++ i){
            for (j = 1; j < n + 1 ; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1 )) {
                    dp[i] [j] = dp[i - 1][ j - 1] ; 
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][ j - 1], dp[i][ j - 1] ))  + 1 ; 
                }
                
            }
        }
        
        return dp[m][n] ; 
    }
}