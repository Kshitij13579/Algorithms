package arrays;

import java.util.HashMap;
import java.util.Stack;

/*
 * https://leetcode.com/problems/next-greater-element-i/description/
 */
public class NextGreaterElement {
    
    /*
     * use map to store the next greater element of each element in nums2 
     * use monotonic stack decreasing order to get the next greater element for all the previous elements.
     * TC: O(N)
     * SC: O(N)
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();

        for(int num:nums2){
            while(!stack.isEmpty() && num> stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }

        return nums1;
    }
    public static void main(String[] args) {
        
    }
}
