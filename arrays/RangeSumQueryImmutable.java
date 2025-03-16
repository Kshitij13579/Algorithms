package arrays;

/*
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 */

 class NumArray {
    int[] prefixSum;

    /*
     * TC: O(N)
     * SC: O(N)
     */
    public NumArray(int[] nums) {
        this.prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
       if(left==0){
        return prefixSum[right];
       }else{
        return prefixSum[right]-prefixSum[left-1];
       }
    }
}


public class RangeSumQueryImmutable {
    

    public static void main(String[] args) {
        NumArray obj=new NumArray(new int[]{1,2,3,4,5,6});
        System.out.println(obj.sumRange(0, 3));
    }
}
