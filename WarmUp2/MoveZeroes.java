package WarmUp2;

/*
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int right=nums.length-1;
        int left=0;

       while(left<right){

            while(nums[left]==0 && left<right){
                int temp=nums[left];
                int i=left;
                while(i < right){
                    nums[i]=nums[i+1];
                    i++;
                }
                nums[right]=temp;
                right--;
            }
            left++;
       }

        for(int val:nums){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void moveZeroesOptimized(int[] nums) {
        int nonZeroIndex=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }

        for(int i=nonZeroIndex;i<nums.length;i++){
            nums[i]=0;
        }

        for(int val:nums){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         moveZeroes(new int[]{0,1,0,3,12});
         moveZeroes(new int[]{0,0,1,4,16});
         moveZeroes(new int[]{1,0,1,0,16});
         moveZeroes(new int[]{1,0,1,0,16,0,0});
         moveZeroes(new int[]{0});
         moveZeroes(new int[]{0,0,0,0});
    }
}
