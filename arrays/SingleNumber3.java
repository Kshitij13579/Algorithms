package arrays;

/*
 * https://leetcode.com/problems/single-number-iii/
 */
public class SingleNumber3 {

     /*
        1.First XOR all the numbers
        2. Find the rightmost set(1) bit for the XOR - This bit will be the different 
        in the two unique numbers
        3. Group numbers into 2 categories based on the set bit and take XOR of each number
        resulting value are the two unique numbers. 

        TC:O(N)
        SC:O(1)
    */
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }

        int diff_bit= xor & (-xor);

        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if((nums[i] & diff_bit)==0){
                res[0]^=nums[i];
            }else{
                res[1]^=nums[i];
            }
        }

        return res;
    }
}
