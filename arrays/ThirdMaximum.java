package arrays;

/*
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximum {
    
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;

        
        for(int i=0;i<nums.length;i++){

            if(first==nums[i] || second==nums[i] || third==nums[i])
                continue;

            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }else if(nums[i]>second){
                third=second;
                second=nums[i];
            }else if(nums[i]>third){
                third=nums[i];
            }
        }

        if(third==Long.MIN_VALUE)
            return (int)first;

        return (int)third;
        
    }
    
    
    public static void main(String[] args) {
        
    }
}
