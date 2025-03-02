package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/summary-ranges/
 */
public class SummaryRanges {
    
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public static List<String> summaryRanges(int[] nums) {
        List<String> summaryRanges=new ArrayList<String>();
        int lower=0;

        if(nums.length==0)
            return summaryRanges;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                continue;
            }else{
                if(lower==i-1){
                    summaryRanges.add(""+nums[lower]);
                    lower=i;
                }else{
                     summaryRanges.add(nums[lower]+"->"+nums[i-1]);
                     lower=i;
                }
               
            }
        }

        if(lower==nums.length-1){
            summaryRanges.add(""+nums[lower]);
        }else{
            summaryRanges.add(nums[lower]+"->"+nums[nums.length-1]);
        }

        return summaryRanges;
    }
    public static void main(String[] args) {
        
    }
}
