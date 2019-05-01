public class Solution {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        char ans = (char) (character - 'a' + 'A');
        // return character.toUpperCase(character)
        return ans;
    }
}