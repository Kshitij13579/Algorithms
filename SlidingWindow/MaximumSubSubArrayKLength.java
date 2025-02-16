package SlidingWindow;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
 */
public class MaximumSubSubArrayKLength {

    /*
     * TC: O(N)
     * SC: O(maxNum) - array to store visited number
     */
    public static long maximumSubarraySum_2(int[] nums, int k) {
        long res=0;
        int maxNum=Integer.MIN_VALUE;
        //find the max number in array
        for(int val:nums){
            maxNum=Math.max(maxNum,val);
        }
        //create a visited map till that number
        int[] visited=new int[maxNum+1];

        int i=0;
        int j=0;
        long sum=0;

        while(j<nums.length){
            sum+=nums[j];
 
            //if visited number
            //shrink the window until duplicate is removed. 
            while(visited[nums[j]]>0){
                    sum-=nums[i];
                    visited[nums[i]]=0;
                    i+=1;
            }
            // if window size is k then caluclate maximum and decrease thewindow from start by one
            if(j-i+1==k){
                res=Math.max(res, sum);
                sum-=nums[i];
                visited[nums[i]]=0;
                i+=1;
            }

            visited[nums[j]]=1;
            j+=1;
        }

        return res;
    }

    /*
     * TC: O(N) - iterating over full array once
     * SC" O(N) - set to store unique values. 
     */
    public static long maximumSubarraySum(int[] nums, int k) {
        if(nums.length<k)
            return 0;
        
        int i=0;
        int j=0;
        long max=0;
        long currentSum=0;
        HashSet<Integer> set=new HashSet<>();
        while(j<nums.length){
            
            while(set.contains(nums[j]) || j-i+1>k){
                set.remove(nums[i]);
                currentSum-=nums[i];
                i+=1;
            }

            set.add(nums[j]);
            currentSum+=nums[j];
            if(j-i+1==k){
                max=Math.max(max,currentSum);
            }
            j+=1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,5,4,2,9,9,9},3));
        System.out.println(maximumSubarraySum_2(new int[]{1,5,4,2,9,9,9},3));
    }
}
