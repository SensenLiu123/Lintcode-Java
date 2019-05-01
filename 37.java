public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int digit1 = number % 10;
        //number /= 10;
        int digit2 = number / 10 % 10; 
        //number /= 10;
        int digit3 = number / 100;
        
        int ans = 100 * digit1 + 10 * digit2 + digit3;
    
        return ans;
        
    }
}