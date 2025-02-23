package arrays;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStocks2 {
    /*
     * TC: O(N)
     * SC: O(N)
     */
    public static int maxProfit(int[] prices) {
        int[] dp=new int[prices.length];
        dp[0]=0;

        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-1]+(prices[i]-prices[i-1]));
        }

        return dp[prices.length-1];
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{2,4,1}));
        System.out.println(maxProfit(new int[]{2,2,2,2}));
        System.out.println(maxProfit(new int[]{7,6,5,4}));
    }
}
