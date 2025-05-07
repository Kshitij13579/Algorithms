package arrays;

/*
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumber2 {

    public static int singleNumber(int[] nums) {
        
        /*count the number of ones in each bit places 
            010
            110
            010
            010

            1 4 0 - is each divisible by 3 - take the remainer
            1%3=1
            4%3=1
            0%3=0
            110 is the unique number

            int is 32 bit in java
        */
        int ans=0;
        for(int i=0;i<32;i++){
            int sum=0;
            for(int num:nums){
                 //System.out.println(Integer.toBinaryString(num));
                sum+=num >> i & 1;
                //System.out.println(Integer.toBinaryString(sum));
            }
            sum=sum%3;
            //System.out.println("Modulus:"+Integer.toBinaryString(sum));
            ans |= sum << i;
            //System.out.println("Modulus:"+Integer.toBinaryString(ans));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
    }
}
