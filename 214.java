public class Solution {
    /**
     * @param A: An integer
     * @return: a float number
     */
    public float maxOfArray(float[] A) {
        // write your code here
        float tmp = A[0];
        for (int i = 0; i < A.length; i ++){
            if (A[i] >= tmp) {
                tmp = A[i];
            }
        }
        return tmp;
    }
}