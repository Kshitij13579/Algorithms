package arrays;

/*
 * https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {
    
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public static int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;

        while(i<=j){
            while(i<=j && nums[j]==val)
                j--;
            if(i<=j && nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;
        }
        return j+1;
    }

    public static void main(String[] args) {
        
    }
}
