package WarmUp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/minimum-absolute-difference
 */
public class MinimumAbsoluteDifference {

    /*
     * TC: O(NlogN) + O(N) - sort + loop( which is apprximately O(N))
     * SC: O(N) - where n is the number of pairs with min difference
     */
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            
            if((Math.abs(arr[i]-arr[i+1])) < minDiff){
                minDiff=Math.abs(arr[i]-arr[i+1]);
                pairs.clear();
                pairs.add(Arrays.asList(arr[i],arr[i+1]));
            }else if((Math.abs(arr[i]-arr[i+1])==minDiff)){
                pairs.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }

        return pairs;
    }

    public static void print(List<List<Integer>> arr){
        for (List<Integer> list : arr) {
            System.out.print(list);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        print(minimumAbsDifference(new int[]{4,2,1,3}));
        print(minimumAbsDifference(new int[]{1,3,6,10,15}));
        print(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }
}
