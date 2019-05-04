public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        int left = 0, right = s.length() -1;
        
        s = s.toLowerCase();
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)) ){
                left ++;
            }
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)) ) {
                right --;
            }
            
            if (s.charAt(left) != s.charAt(right) ){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}