package arrays;

/*
 * https://leetcode.com/problems/range-sum-query-2d-immutable/
 */
public class RangeSumQuery2DImmutable {

    int[][] prefixSum;

    /*
     * TC: O(N^2)
     * SC: O(N^2)
     */
    public RangeSumQuery2DImmutable(int[][] matrix) {
        prefixSum=new int[matrix.length+1][matrix[0].length+1];

        for(int i=1;i<prefixSum.length;i++){
            int prefix=0;
            for(int j=1;j<prefixSum[0].length;j++){
                prefix+=matrix[i-1][j-1];
                prefixSum[i][j]=prefix+prefixSum[i-1][j];
            }
        }

    }

    public void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int bottonRight=prefixSum[row2+1][col2+1];
        int topRight=prefixSum[row1][col2+1];
        int bottomLeft=prefixSum[row2+1][col1];
        int topLeft=prefixSum[row1][col1];

        return bottonRight-topRight-bottomLeft+topLeft;
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        RangeSumQuery2DImmutable r=new RangeSumQuery2DImmutable(matrix);
        r.print(r.prefixSum);
    }
}
