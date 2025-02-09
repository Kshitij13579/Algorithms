package WarmUp2;

/*
 * https://leetcode.com/problems/three-consecutive-odds
 */
public class ThreeConsecutiveOddNumbers {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3)
            return false;
        
        for(int i=2;i<arr.length;i++){
            if(arr[i-2]%2==1 && arr[i-1]%2==1 && arr[i]%2==1)
                return true;
        }
        return false;

    }
    
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
        System.out.println(threeConsecutiveOdds(new int[]{1}));
    }
}
