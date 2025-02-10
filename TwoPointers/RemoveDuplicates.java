package TwoPointers;
/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicates {

    /*
     * TC: O(N)
     * SC: O(1)
     */
    static int removeDuplicates(int[] nums){
        if(nums.length<=1)
            return nums.length; 
        int i=1;
        int j=1;

        while(j<nums.length){
            //increment j till nums[j] is different than nums[i]
            while(j<nums.length && nums[i-1]==nums[j])
                j+=1;
            
            //i and j are different - swap i and j
            if(j==nums.length){
                break;
            }
            if(j<nums.length){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j++;
            i++;
        }
        
        return i;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{9,9,9,9,8,8,8,7,7,6,5,4,3,3,3,3};
        int n=removeDuplicates(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
