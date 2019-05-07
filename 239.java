public class Solution {
    /*
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // write your code here
        
        if (a == 0.0) {
            double [] ans = new double [1];
            ans[0] = -c / b;
            return ans;
        }
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            
            return new double [0];
            
        } else if (delta == 0) {
            
            double [] ans = new double [1];
            ans[0] = -b / (2 * a);
            return ans;
            
        } else {
            
            delta = Math.sqrt(delta);
            double [] ans = new double [2];
            double root1 = (-b + delta)/ (2 * a);
            double root2 = (-b - delta) / (2 * a);
            
            if (root1 < root2){
                ans[0] = root1;
                ans[1] = root2;
            } else{
                ans[0] = root2;
                ans[1] = root1;
            }
            return ans;
        }
    }
}