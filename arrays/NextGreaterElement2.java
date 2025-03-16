package arrays;

import java.util.Arrays;
import java.util.Stack;

/*
 * https://leetcode.com/problems/next-greater-element-ii/description/
 */
public class NextGreaterElement2 {
    
    /*
     * Iterate the array twice (i%nums.length - circular array)
     * use decreasing monotonic stack to store the indices of the 
     * next greater element. 
     * TC: O(N)
     * SC:O(N)
     */
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<Integer>();
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        for(int i=0;i<2*nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%nums.length]){
                result[stack.pop()]=nums[i%nums.length];
            }

            if(i<nums.length)
                stack.push(i);
        }

        return result; 
    }
    
    public static void main(String[] args) {
        
    }
}
