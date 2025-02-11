package TwoPointers;

/*
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {
    /*
     * TC: O(n)
     * SC: O(1)
     */
    public static int trap(int[] height) {
        int left=0;
        int right=height.length-1;

        int leftMax=height[left];
        int rightMax=height[right];
        int res=0;

        while(left<=right){
            
            if(height[left]<=height[right]){
                //maximum amount I can store is leftMax - height[left]
                res+=Math.max(0,leftMax-height[left]);
                //updating value to leftMax
                leftMax=Math.max(leftMax, height[left]);
                left++; 
            }else{
                //maximum amount I can store is rightMax - height[right]
                res+=Math.max(0,rightMax-height[right]);
                rightMax=Math.max(rightMax, height[right]);
                right--; 
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
