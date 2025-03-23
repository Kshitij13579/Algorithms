package arrays;

/*
 * https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class MatrixDiagonalSum {
    
    /*
     * Time Complexity: O(M) – m is the number of rows of matrix
     * Space Complexity: O(1)
     */
    public int diagonalSum(int[][] mat) {
        int sum=0;
        //diagnol sum
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i]+mat[i][mat[0].length-i-1];
        }

        if(mat.length%2!=0)
            sum-=mat[mat.length/2][mat.length/2];
        return sum;
    }

    public static void main(String[] args) {
        
    }
}
