package arrays;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStocks {
    
    /*
     * TC: O(N)
     * SC: O(1)
     */
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
             //minimum prices seen till now
             min=Math.min(min,prices[i]);
 
             maxProfit=Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
     }

    public static void main(String[] args) {
        
    }
}
