package sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class RadixSort {
    
    public static int digitPlace(int n,int iter){
        return (n/(int)(Math.pow(10, iter)))%10;
    }

    /*
     * TC: O(N*d) - N is number of elements and d is number of maximum digits
     * SC; O(n) - N is number of elements
     */
    public static void radixSort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max)
                max=val;
        }

        int iter=0;
        while(max>0){
            max/=10;
            iter++;
        }
        
        TreeMap<Integer,ArrayList<Integer>> sortedArray = new TreeMap<>();
        for(int i=0;i<10;i++){
            sortedArray.put(i, new ArrayList<>());
        }

        int i=0;
        while(i<iter){
            for(int val:arr){
                int digit=digitPlace(val, i);
                sortedArray.get(digit).add(val);
            }
            int k=0;
            for(Map.Entry<Integer,ArrayList<Integer>> entry:sortedArray.entrySet()){
                for(int obj=0;obj<entry.getValue().size();obj++){
                    if(entry.getValue().get(obj)!=null){
                        arr[k]=entry.getValue().get(obj);
                        k++;
                    }
                    
                }
                entry.getValue().clear();
            }
            i++;
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        radixSort(new int[]{813,988,9878,212});
        radixSort(new int[]{999,987,986,985,984});
    }
}
