package WarmUp2;

/*
 * https://leetcode.com/problems/richest-customer-wealth
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    /*
     * Time Complexity: O(N^2) 
     * Space Complexity: O(1)
     */
    public static int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }

            if(sum>max)
                max=sum;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }

}
