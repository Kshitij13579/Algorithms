package SlidingWindow;

/*
 * https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
 */
public class MaximumPointsFromCard {
    
    /*
     * TC: O(2*K)
     * SC: O(1)
     */
    public static int maxScore(int[] cardPoints, int k) {
        int leftSum=0,rightSum=0,max=0;

        //calculate leftsum for k elements
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }

        //assume max as the leftsum
        max=leftSum;
        int idx=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[idx--];
            max=Math.max(max,leftSum+rightSum);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1,2,1},2));
    }
}
