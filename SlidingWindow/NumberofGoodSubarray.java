package SlidingWindow;

import java.util.HashMap;

public class NumberofGoodSubarray {
    
    static long countGood(int[] nums, int k){
        long res=0;

        int i=0,j=0;
        HashMap<Integer,Integer> map=new HashMap();
        int pairs=0;

        while(j<nums.length){
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            pairs+=map.get(nums[j])-1;

            if(pairs>=k){
                res+=nums.length-j;
                while(i<j && pairs>=k){
                    map.put(nums[i], map.get(nums[i])-1);
                    pairs-=map.get(nums[i]);
                    i++;
                    if(pairs>=k)
                        res+=nums.length-j;
                }
            }

            j+=1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(countGood(new int[]{3,1,4,3,2,2,4}, 2));
        System.out.println(countGood(new int[]{3,1,4,3,2,2,4}, 1));
    }
}
