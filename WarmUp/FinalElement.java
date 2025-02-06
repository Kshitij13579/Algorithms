package WarmUp;

import java.util.Arrays;

/*
 * Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
element would be removed, while in the second step minimum element of the remaining array would
be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
element. And find the final element remaining in the array.
 */
public class FinalElement {

    static int finalElement(int[] arr){
        Arrays.sort(arr);

       return (arr.length%2==0)? arr[(arr.length/2)-1]:arr[arr.length/2];
    }

    public static void main(String[] args) {
        System.out.println(finalElement(new int[]{7, 8, 3, 4, 2, 9, 5}));
        System.out.println(finalElement(new int[]{1, 2, 3, 4, 2, 9, 5}));
        System.out.println(finalElement(new int[]{7, 8, 3}));
        System.out.println(finalElement(new int[]{8, 1, 2, 9, 4, 3, 7, 5}));
    }
}
