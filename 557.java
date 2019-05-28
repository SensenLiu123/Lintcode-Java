public class Solution {
    /*
     * @param str: a string
     * @return: Return a hash map
     */
    public Map<Character, Integer> countCharacters(String str) {
        Map<Character , Integer> ans = new HashMap<> (); 
        
        char [] charList = str.toCharArray(); 
        
        for (char c : charList) {
            
            if (!ans.containsKey(c) ){
                ans.put(c, 1) ; 
                
            } else {
                ans.put (c, ans.get(c) + 1   ) ; 
            }
            
            
        }
        
        return ans ;
    }
}