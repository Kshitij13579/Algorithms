package arrays;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/degree-of-an-array/
 */
public class DegreeOfArray {

    /*
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map=new HashMap<Integer,int[]>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new int[]{1,i,i});
            }else{
                int[] num=map.get(nums[i]);
                num[0]++;
                num[2]=i;
            }
        }

        int degree=Integer.MIN_VALUE; int shortestLength=Integer.MAX_VALUE;

        for(int[] value:map.values()){
            if(value[0]>degree){
                degree=value[0];
                shortestLength=value[2]-value[1]+1;
            }

            if(value[0]==degree){
                shortestLength=Math.min(value[2]-value[1]+1,shortestLength);
            }
        }

        return shortestLength;

    }
    
    public static void main(String[] args) {
        
    }
}
