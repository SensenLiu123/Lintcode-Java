public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        if (nums.length <= 1) {
            return 0;
        }
        
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[maxIndex]){
                maxIndex = i;
            }
        }
        
        int secondMax;
        if (maxIndex == 0){
            secondMax = 1;
        } else {
            secondMax = 0;
        }
        
        
        for (int i = 0; i < nums.length; i++){
            if (i == maxIndex) {
                continue;
            }
            if (nums[i] >= nums[secondMax]){
                secondMax = i;
            }
        }
        
        return nums[secondMax];
    }
}