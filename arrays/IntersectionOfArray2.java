package arrays;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 */
public class IntersectionOfArray2 {

    /*
     * TC: O(N)
     * SC: O(N)
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> intersect=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                intersect.add(nums2[i]);
                int freq=map.get(nums2[i])-1;
                if(freq==0){
                    map.remove(nums2[i]);
                    continue;
                }

                map.put(nums2[i],freq);
            }
        }

        int[] res=new int[intersect.size()];
        int curr=0;
        for(int k:intersect)
            res[curr++]=k;
        return res;
    }
    public static void main(String[] args) {
        
    }
}
