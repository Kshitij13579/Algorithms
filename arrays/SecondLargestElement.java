package arrays;

import java.util.Arrays;

public class SecondLargestElement {

    //sorting approach
    /*Time: (O(n*log(n)) 
     * Space: O(1)
    */
    public static int secondlargestElementSorting(int[] arr){
        Arrays.sort(arr);
        int n= arr.length;
        for (int i = n - 2; i >= 0; i--) {
            
            // return the first element which is not equal to the 
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    //two pass serach approach - search array twice
    /*Time: O(n)
     * O(1)
     */
    public static int secondlargestElementTwoPass(int[] arr){
        
        int largest=-1; int secondlargest=-1;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=largest && arr[i]>secondlargest)
                secondlargest=arr[i];
        }

        return secondlargest;

    }
    //one pass search approach
    /*Time: O(n)
     * O(1)
     */
    public static int secondlargestElementOnePass(int[] arr){
        int largest=-1;
        int secondlargest=-1;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int[] arr= new int[] {1,2,3,4,5,10,6,9,2,3,8};
        int[] arr1= new int[] {1,1,1,1,1,1};

        System.out.println("Second LargestElement Sorting:"+secondlargestElementSorting(arr));
        System.out.println("Second LargestElement Two pass:"+secondlargestElementTwoPass(arr));
        System.out.println("Second LargestElement One pass:"+secondlargestElementOnePass(arr));
    }
}
