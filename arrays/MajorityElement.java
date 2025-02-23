package arrays;

/*
 * https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    
    /*
     * Solving using Moores Algorithm 
     * Initialize two variables:count and candidate. Set count to 0 and candidate to an arbitrary value.
     * Iterate through the arraynums:
     *   a. If count is 0, assign the current element as the new candidate and increment count by 1.
     *   b. If the current element is the same as the candidate, increment count by 1.
     *   c. If the current element is different from the candidate, decrement count by 1.
     * After the iteration, the candidate variable will hold the majority element.
     * TC: O(N)
     * SC: O(1)
     */
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=nums[0];

        for(int i=0;i<nums.length;i++){
            if(count==0)
                candidate=nums[i];
            if(nums[i]==candidate)
                count++;
            else{
                count--;
            }
        }

        return candidate;
    } 
    
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
