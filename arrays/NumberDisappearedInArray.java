package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class NumberDisappearedInArray {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                index=(nums[i]*-1)-1;
            }else{
                index=nums[i]-1;
            }

            if(nums[index] > 0){
                nums[index]=-nums[index];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }

        return result; 
    }
    
    public static void main(String[] args) {
        
    }
}
