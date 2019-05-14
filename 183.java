public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {

        long sum = 0L , max_len = 0L;
        for (int i = 0; i < L.length; ++i ) {
            sum += L[i] ;
            if (L[i] > max_len){
                max_len = L[i] ;
            }
        }
        
        if (k > sum) {
            return 0 ;
        }
        
        long start = 1L, end = max_len ;  
        
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            
            if (cut(L, mid) >= k ) {
                start = mid ;
            } else {
                end = mid ;
            }
        }
        
        if (cut(L, end) >= k) {
            return (int) end ;
        } 
        
        return (int) start ;
    }
    
    
    private int cut (int[] L, long mid ) {
        int count = 0 ;
        for (int i = 0; i < L.length;  ++i ){
            count += L[i] / (int) mid ;
        }
        
        return count ;
        
    }
}