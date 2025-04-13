package arrays;

/*
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public int singleNumber(int[] nums) {
        int singleElement=nums[0];

        for(int i=1;i<nums.length;i++){
            singleElement=singleElement^nums[i];
        }

        return singleElement;
    }
    
    public static void main(String[] args) {
        
    }
}
