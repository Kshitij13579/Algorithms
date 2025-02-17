package SlidingWindow;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*
 * https://leetcode.com/problems/sliding-subarray-beauty/
 */
public class SlidingSubarrayBeauty {
    
    /*
     * TC: O(N*K)
     * SC: O(1)
     */
    public static int[] getSubarrayBeauty_optimized(int[] nums, int k, int x) {
        int n = nums.length;
        int[] freq = new int[51];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0, j = 0; i < n; i++) {
            // count freq of negative numbers in current sliding windows
            if (nums[i] < 0) freq[Math.abs(nums[i])]++;
            if (i - j + 1 >= k) {
                int cnt = 0;
                // calculate xth smallest number in current sliding windows
                for (int L = 50; L >= 1; L--) {
                    cnt += freq[L];
                    if (cnt >= x) { 
                        ans.add(-L);
                        break;
                    }
                }
                // No xth smallest number present 
                if (cnt < x) ans.add(0);
                if (nums[j] < 0) freq[Math.abs(nums[j])]--;
                j++;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int i=0,j=0,idx=0;
        int[] ans=new int[n-k+1];
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(); //need to sort keys for finding xth smallest integer

        while(j<n){
            //counting the frequncy of negative number
            if(nums[j]<0){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }

            //if window size exceeds than k then shink the window
            if(j-i+1>k){
                if(nums[i]<0){
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0) 
                        map.remove(nums[i]);
                }
                i++;
            }

            //if I reach the window of size k
            if(j-i+1==k){
                int count=0;
                boolean flag = false; //there are atleast x -ve integers
                //check if there are fewer than x negative integers.
                for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                    count+=entry.getValue();
                    if(count>=x){
                        ans[idx]=entry.getKey();
                        idx++;
                        flag=true;
                        break;
                    }
                }

                if(!flag)
                    ans[idx++]=0;
            }  
            j++;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr=getSubarrayBeauty(new int[]{1,-1,-3,-2,3},3,2);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
