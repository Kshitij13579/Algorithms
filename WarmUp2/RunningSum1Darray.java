package WarmUp2;

import java.util.Arrays;
/*
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class RunningSum1Darray {

  /*
   * TC: O(N)
   * SC: O(N)
   */
  public static int[] runningSum(int[] nums) {

        int[] dp=new int[nums.length+1];
        dp[0]=0;

        for(int i=1;i<dp.length;i++){
            dp[i]=dp[i-1]+nums[i-1];
        }

        return Arrays.copyOfRange(dp,1,dp.length);
        
    }  
  public static void main(String[] args) {
    
  }
}
