package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 */
public class KidsWithMaximumCandies {

    /*
     * TC: O(2N)
     * SC: O(1)
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<Boolean>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}
