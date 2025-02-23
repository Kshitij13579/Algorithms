package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalTriangle2 {
    
    /*
     * TC: O(rowIndex)
     * SC: O(rowIndex)
     */
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList();
        result.add(1);
        long temp=1;
        for(int i=1;i<=rowIndex;i++){
            temp*=rowIndex-i+1;
            temp/=i;
            result.add((int)temp);
        }
        return result;
        
    }
    
    public static void main(String[] args) {
        
    }
}
