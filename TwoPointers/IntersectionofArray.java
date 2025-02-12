package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

/*
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionofArray {
    
    /*
     * TC: O(NlogN + MlogM) : because of sorting function
     * SC: O(N+M): worst case when all elements are different
     */
    public static void intersection(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0; //start pointer of first array
        int j=0; //start pointer of second array
        HashSet<Integer> set = new HashSet<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                set.add(a[i]);
                i+=1;
                j+=1;
            }else if(a[i]<b[j])
                i+=1;
            else
                j+=1;
        }

        System.out.println(set);
    }
    public static void main(String[] args) {
        intersection(new int[]{1,1,2,2,3,4}, new int[]{1,1,2,3});
        
    }
}
