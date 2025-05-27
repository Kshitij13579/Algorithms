package arrays;

/*
 * https://leetcode.com/problems/ones-and-zeroes/description/
 */
public class OnesAndZeroes {

     /*
      Define a two dimentional DP array d[i][j] represents the size of the largest subset we can form with at most i    '0's  and j '1's. The values of i range from 0 to m, and the values of j range from 0 to n, representing all possible constraints we might encounter.

      We iterate through each string in strs and count its '0's and '1's. Then, for each string, we update our array f in a decreasing manner, starting from m to the count of '0's in the current string (a) and from n to the count of '1's (b).

      While updating, we consider two cases for each cell d[i][j]:

      Not including the current string, which means the d[i][j] would remain unchanged.
      Including the current string, where we have to look at the value in the cell that represents the leftover capacity (d[i - a][j - b]) after including this string and add 1 to that value to represent the current string being counted.
      We choose the maximum of these two choices at every step, which ensures that we always have the largest possible subset for a given i and j.
 
      After iterating through all strings and updating the array, the value of d[m][n] will give us the size of the largest subset conforming to our constraints.

      TC:O(L*(l+M*N)) where L is the length of strs array, l is the length of each string
      SC:O(M*N)
    */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];

        for(int s=0;s<strs.length;s++){

            int countOne=0;
            int countZero=0;

            for(int c=0;c<strs[s].length();c++){
                if(strs[s].charAt(c)=='1') countOne++;
                if(strs[s].charAt(c)=='0') countZero++;
            }

            for(int i=m;i>=countZero;i--){
                for(int j=n;j>=countOne;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-countZero][j-countOne]+1);
                }
            }

        }

        return dp[m][n];
    }

}
