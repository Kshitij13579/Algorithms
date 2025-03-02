package arrays;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {
    
    /*
     * TC: O(N)
     * SC: O(N)
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        if(set.size()!=nums.length)
            return true;
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3}));
        System.out.println(containsDuplicate(new int[]{1,2,1}));
    }
}
