package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalTriangle {
    
    /*
     * TC: O(N^2)
     * SC: O(N^2)
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList();

        for(int i=0;i<numRows;i++){
            List<Integer> currentRow=new ArrayList();
            currentRow.add(1);

            //jth index of current processing row
            for(int j=1;j<i;j++){
                int value= result.get(i-1).get(j) + result.get(i-1).get(j-1);
                currentRow.add(value);
            }

            //last value of row is 1
            if(i>0)
                currentRow.add(1);
            
            result.add(currentRow);
        }

        return result;

    }
    public static void main(String[] args) {
        
    }
}
