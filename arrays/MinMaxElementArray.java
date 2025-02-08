package arrays;

public class MinMaxElementArray {

    /*
     * TC: O(N)
     * Sc: O(1)
     */
    static void maxandminElement(int[] arr, int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
            
            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }

    public static void main(String[] args) {
        maxandminElement(new int[]{-4,2,3,45,90}, 5);
    }
}
