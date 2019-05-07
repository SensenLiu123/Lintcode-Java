public class Solution {
    /**
     * @param n: The number of digits
     * @return: All narcissistic numbers with n digits
     */
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        
        if (n == 1) {
            for (int i = 0; i < 10; ++i)
                ans.add(i);
            return ans;
        }
        
        for (int i = pow(10, n - 1); i < pow(10, n); ++i) {
            if ( isNarci(i, n) ) {
                ans.add(i);
            } 
        }
        
        
        return ans;
    }
    
    
    private boolean isNarci(int num, int n) {
        int origin = num;
        int narciss = 0;
        
        while (num > 0){
            int digit = num % 10;
            narciss += pow(digit, n);
            num /= 10;
        }
        
        return narciss == origin;
    }
    
    
    private int pow(int a, int b){
        int ans = 1;
        while (b > 0){
            ans *= a;
            b --;
        }
        return ans;
    }
}