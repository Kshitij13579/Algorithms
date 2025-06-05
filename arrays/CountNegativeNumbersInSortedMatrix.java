package arrays;

/*
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
 */
public class CountNegativeNumbersInSortedMatrix {

    /*
     * 
     * This problem can be solved with a binary search.

       For every row do the binary search to find exact position of the fist negative element, after that all elements are negative.
       Optimization here - for every next row the right limit for the binary search can be the index of the first negative from the previous row. 
       This is due to fact that cols are also sorted so for the same column for every negative element the element below can be only negative. 
       Thus we can explude it from the binary search on the next step.
       Also taking care of the edge cases helps - if first element is < 0 then all elements in a row are negative, if last one is non-negative 
       then all elements are non-negative.
       
       TC:  O(rows x lg(cols)) time - need to do lg(cols) binary search for each of rows row, 
       SC : O(1) space - no extrace space other than few variables.
     * 
     */
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int lastNegativeIndex=col-1;
        int count=0;
        for(int i=0;i<row;i++){
            
            //if first index is negative then the rest of columns are negative
            if(grid[i][0]<0){
                count+=col;
                continue;
            }

            //if last number if positive then there is no negative
            if(grid[i][col-1] >=0)
                continue;

            int left=0; int right=lastNegativeIndex;
            /*
                search for the index where 
                the first negative number occurs
            */
            while(left<=right){
                int mid = left + (right-left)/2;
                if(grid[i][mid] < 0)
                    right = mid-1;
                else
                    left = mid+1;
            }

            count+=(col-left);
            lastNegativeIndex=left;
        }

        return count;
    }

}
