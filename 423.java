public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
     
    
    // Map<Character, Character> parentheses = new HashMap<Character, Character>();
    // parentheses.put('(', '')")
    // parentheses.put
    
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack <Character> stack = new Stack<Character>();
        
        char [] array = s.toCharArray();
        
        for (int i = 0 ; i < array.length; ++ i) {
            
            char bracket = array[i] ; 
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                
                stack.push(bracket) ;
                continue ;
                
            } else if (stack.isEmpty() ){
                
                return false ; 
                
            } else {
                
                // if bracket is right 
                char left = stack.pop() ;
                if (!isPair(left , bracket)){
                    return false ;
                    
                }
                
                continue;
                
            }
        }
        
        return stack.isEmpty() ;
    }
    
    
    private boolean isPair(char left, char right) {
        if (left == '(') {
            
            return right == ')' ;
            
        } else if (left == '[') {
            
            return right == ']' ; 
            
        } else {
            
            return right == '}' ;
            
        }
        
    }
}