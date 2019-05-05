public class Solution {
    /*
     * @param k: An integer
     * @return: all amicable pairs
     */
    public List<List<Integer>> amicablePair(int k) {
        // write your code here
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if (k < 284) {
            return ans;
        } 
        
        for (int i = 2; i <= k; ++i) {
            int possible = getAmicable(i);
            
            if (possible <= i || possible > k) {
                continue;
            }
            
            if (getAmicable(possible) == i){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(i);
                pair.add(possible);
                ans.add(pair);
            }
        }
        return ans;
        
    }
    
    private int getAmicable(int num){
        int ans = 1, i;
        for (i = 2; i * i <= num; ++i){
            if (num % i == 0){
                ans += i + num /i;
            }
            
            if (i * i == num){
                ans -= i;
            }
        }
        return ans;
    }
}