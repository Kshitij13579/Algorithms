package arrays;

public class TwoMaxSum{
    /*
     * TC: O(N)
     * SC: O(1)
     */
    static void find2Max(int[] arr, int n)
    {
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first_max){
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max){
                second_max=arr[i];
            }
        }

        System.out.println(first_max);
        System.out.println(second_max);
    }
    
    public static void main(String[] args) {
        find2Max(new int[]{4,1},2);
        find2Max(new int[]{10,12,90,90,7,80},6);
        find2Max(new int[]{-10,-10,-3,-4,-4,-5},6);
    }
}