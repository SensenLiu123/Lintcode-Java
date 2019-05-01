public class Solution {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        
        int [] array = new int [31];
        int count = 0;
        
        while (num > 0) {
            array[count] = num % 10;
            num = num / 10;
            count ++;
        }    
        
        count -= 1;
        //int total = count;
        int i = 0;
        
        while (i < count){
            if (array[i] != array[count]){
                return false;
            }
            i++;
            count--;
        }
        return true;
    }
}