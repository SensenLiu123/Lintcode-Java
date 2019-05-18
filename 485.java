public class Solution {
    /**
     * @param size: An integer
     * @return: An integer list
     */
    public List<Integer> generate(int size) {
        // write your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 1; i <= size ; i++) {
            ans.add(i) ;
        }
        
        return ans ;
    }
}