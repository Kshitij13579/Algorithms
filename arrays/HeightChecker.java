package arrays;

import java.util.Arrays;

/*
 *  https://leetcode.com/problems/height-checker/
 */
public class HeightChecker {
    
    /*
     * Time Complexity: O(NlogN + N)
     * Space Complexity: O(N)
     */
    public int heightChecker(int[] heights) {
        int[] expected=Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
                count++;
        }

        return count;

    }

    
    public static void main(String[] args) {
        
    }
}
