package WarmUp;

import java.util.Arrays;

public class ExceptTwoLargest {
    static void ExceptTwoLargest(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ExceptTwoLargest(new int[]{2, 8, 7, 1, 5});
        ExceptTwoLargest(new int[]{7, -2, 3, 4, 9, -1});
        
    }
}
