public class Solution {
    /**
     * @param s1: A string
     * @param s2: Another string
     * @return: whether s2 is a scrambled string of s1
     */
    public boolean isScramble(String s1, String s2) {
        if (s1.length()  != s2.length() ) {
            return false  ;
        }
        
        return dfs(s1, s2) ; 
        
    }
    
    
    private boolean dfs(String s1, String s2) {
        if (s1.length()  != s2.length() ) {
            return false  ;
        }
        
        if (s1.length() == 1) {
            return s1.equals(s2) ; 
        }
        
        char [] charArr1 = s1.toCharArray() ; 
        char [] charArr2 = s2.toCharArray() ; 
        
        Arrays.sort(charArr1) ; 
        Arrays.sort(charArr2) ; 
        for (int i = 0; i < charArr1.length ; ++ i) {
            if (charArr1[i] != charArr2[i] ) {
                return false ; 
            }
        }
        
        int n = s1.length() ; 
        for (int i = 1 ; i < n ; ++i) {
            boolean case1 = dfs(s1.substring(0,i), s2.substring(0, i) ) && dfs( s1.substring(i,n), s2.substring(i, n) ) ;
            
            boolean case2 = dfs(s1.substring(0,i), s2.substring(n - i, n) ) &&  dfs(s1.substring(i,n), s2.substring(0, n - i) ) ;
            
            if ( case1 || case2 ) {
                return true ; 
            }
            
        }
        
        return false ;
        
        
    }
}