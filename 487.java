public class Solution {
    /**
     * @param names: a string array
     * @return: a string array
     */
    public List<String> nameDeduplication(String[] names) {
        Set<String> pool = new HashSet<>();
        
        for (int i = 0; i < names.length ; ++i) {
            
            String smallName = names[i].toLowerCase() ;
            
            if (pool.contains(smallName) ){
                continue ;
            }
            
            pool.add(smallName) ; 
        }
        
        List<String>  ans = new ArrayList<String>(pool) ;
        
        return ans ;
    }
}