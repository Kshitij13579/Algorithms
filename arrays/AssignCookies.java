package arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/assign-cookies/
 */
public class AssignCookies {
    
    /*
     * Time Complexity: O(NlogN + G + S)
     * Space Complexity: O(N)
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }else{
                j++;
            }
        }

        return i;
    }
    
    public static void main(String[] args) {
        
    }
}
