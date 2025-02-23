package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/missing-ranges/description/
 */
public class MissingRanges {
    
    /*
     * TC: O(N)
     * SC: O(N)
     */
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result=new ArrayList<>();

        int next=lower;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<next)
                continue;
            
            if(nums[i]==next){
                next++;
                continue;
            }

            result.add(Arrays.asList(next,nums[i]-1));
            next=nums[i]+1;
        }

        if(next<=upper){
            result.add(Arrays.asList(next,upper));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0,1,3,5,50,75}, 0, 99));
        System.out.println(findMissingRanges(new int[]{0}, 0, 0));
        System.out.println(findMissingRanges(new int[]{}, 0, 0));
        System.out.println(findMissingRanges(new int[]{7,10,20,30,50,75}, 0, 99));
        System.out.println(findMissingRanges(new int[]{7,10,20,30,50,75}, 20, 99));
        System.out.println(findMissingRanges(new int[]{7,10,20,30,50,75}, 20, 76));
    }
}
