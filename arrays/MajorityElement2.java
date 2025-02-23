package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/majority-element-ii/description/
 */
public class MajorityElement2 {

    /*
     * Use Moores Algorithm to find 2 majority element potential candidates
     * find the frequency of each potential candidate
     * if >n/3 then add to list
     * TC: O(N)
     * SC: O(1)
     */
    public static List<Integer> majorityElement(int[] nums) {
        int candidate1=Integer.MIN_VALUE;
        int candidate2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(candidate1==nums[i]){
                count1++;
            }else if(candidate2==nums[i]){
                count2++;
            }
            else if(count2==0){
                candidate2=nums[i];
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                count1++;
            }
            else{
                count1--;
                count2--;
            }
        }

        //calculate frequency of candidates
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1)
                count1++;
            if(nums[i]==candidate2)
                count2++;
        }

        List<Integer> res=new ArrayList<>();

        if(count1>(nums.length/3))
            res.add(candidate1);
        if(count2>(nums.length/3))
            res.add(candidate2);
        
        return res;
    }
    
    public static void printList(List<Integer> list){
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printList(majorityElement(new int[]{3,2,3}));
        printList(majorityElement(new int[]{2,3}));
        printList(majorityElement(new int[]{1}));
        printList(majorityElement(new int[]{2,2}));
        printList(majorityElement(new int[]{2,2,2,2,2}));
        printList(majorityElement(new int[]{0,0,0,0}));
        printList(majorityElement(new int[]{2,1,1,3,1,4,5,6}));
    }
}
