package arrays;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/reduce-array-size-to-the-half/
 */
public class ReduceArraySizeByHalf {

    /*
     * TC: O(N)
     * SC: O(N)
     */
    public int minSetSize(int[] arr) {
       int n=arr.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int x : arr){
        map.put(x, map.getOrDefault(x, 0) + 1);
        if(map.get(x) >= n/2)
            return 1;
       } 

       int[] countValues=new int[n+1];
       for(int freq:map.values()) ++countValues[freq];

        int ans =0,sum=0,freq=n;

        while(sum<n/2){
            ans+=1;
            while(countValues[freq]==0)
                freq--;
            sum+=freq;
            --countValues[freq];
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
