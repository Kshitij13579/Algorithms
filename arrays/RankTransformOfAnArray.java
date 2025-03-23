package arrays;

import java.util.Arrays;
import java.util.HashMap;

/*
 * https://leetcode.com/problems/rank-transform-of-an-array/description/
 */
public class RankTransformOfAnArray {
    
    /*
     * Time Complexity: O(NlogN)
     * Space Complexity: O(N)
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> rank = new HashMap<>();
        for (int x : temp)
          rank.putIfAbsent(x, rank.size() + 1);
        for (int i = 0; i < arr.length; ++i)
          temp[i] = rank.get(arr[i]);
        return temp;
    }

    public static void main(String[] args) {
        
    }
}
