package arrays;

public class ShuffleArray {

    /*
    If there are two numbers n1 and n2, one could come up with a larger number M (greater than both n1 and n2) and store  
    a single number having value V = M*n1+n2. Later on, if we want to extract the 2 numbers from V, we can do so like so,

    n1 = V/M
    n2 = V%M

    TC: O(N)
    SC: O(1)
    */
    public int[] shuffle(int[] nums, int n) {
        int max=1001;

        for(int i=n;i<2*n;i++){
            nums[i]=max*nums[i]+nums[i-n];
        }

        int index=0;
        for(int i=n;i<2*n;i++){
            nums[index]=nums[i]%max;
            nums[index+1]=nums[i]/max;
            index+=2;
        }

        return nums;
    }
}
