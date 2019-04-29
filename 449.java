public class Solution {
    /**
     * @param character: a character
     * @return: An integer
     */
    public int charToInteger(char character) {
        // write your code here
        return character - 'a' + 97; 
        // alternatively, return (int) character 
    }
}