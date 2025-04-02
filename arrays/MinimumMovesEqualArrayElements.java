package arrays;

/*
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
 */
public class MinimumMovesEqualArrayElements {
    
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public int minMoves(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<min)
                min=nums[i];
        }
        return sum-(n*min);
    }
    
    public static void main(String[] args) {
        
    }
}
