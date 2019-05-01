import java.util.Arrays;
public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        
        if (nums.length <= 1){
            return nums.length;
        }
        
        Arrays.sort(nums);
        
        
        int fast = 1;
        int slow = 0;
        int count = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
                count ++;
            } 
            
            fast ++;
        }
        return count;
    }
}