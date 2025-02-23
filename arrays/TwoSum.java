package arrays;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    /*
     * TC: O(N)
     * SC: O(N)
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i]))
                map.put(nums[i],i);
            else{
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                break;
            }
        }
        System.out.println(res[0]+" "+res[1]);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15}, 9));
        System.out.println(twoSum(new int[]{3,2,4}, 6));
        System.out.println(twoSum(new int[]{3,3}, 6));
        System.out.println(twoSum(new int[]{-10,-9},-19));
    }
}
