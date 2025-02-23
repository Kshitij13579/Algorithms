package arrays;
/*
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class Merge2SortedArray {
    
    /*
     * TC: O(M+N)
     * SC: O(1)
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        //starting from largest to smallest
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }

        for(int val:nums1){
            System.out.print(val+" ");
        }
    }
    
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
