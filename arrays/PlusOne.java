package arrays;

/*
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;

    }

    public static void main(String[] args) {
        
    }
}
