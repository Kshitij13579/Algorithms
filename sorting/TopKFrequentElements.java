package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    
    public static int partition(List<Map.Entry<Integer,Integer>> arr,int left,int right){
    
        int pivot=arr.get(right).getValue();
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr.get(j).getValue()<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,right);
        return i+1;
    }

    public static void swap(List<Map.Entry<Integer,Integer>> arr,int i,int j){
        Map.Entry<Integer,Integer> temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }

    public  static void quickSelect(List<Map.Entry<Integer,Integer>> arr,int left,int right,int k_index){
        if(left<right){
            int pivotIndex=partition(arr,left,right);
            
            quickSelect(arr,left,pivotIndex-1,k_index);
            quickSelect(arr,pivotIndex+1,right,k_index); 
        }
    }

    /*
     * 1. Perform quick sort on frequency of elemnts
     * 2. Retriev all frequencies greater than n-k where n is the length of frequency array.
     * TC: O(nlogn) - average case
     * SC: O(N)
     */
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count_map=new HashMap<Integer,Integer>();
        for(int val:nums){
            count_map.put(val,count_map.getOrDefault(val,0)+1);
        }

        List<Map.Entry<Integer,Integer>> count_list = new ArrayList<>(count_map.entrySet());
        int n=count_list.size();

        quickSelect(count_list,0,n-1,n-k);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=count_list.get(n-k+i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result=topKFrequent(new int[]{1,1,2,3,3,3},2);
        for(int val:result){
            System.out.print(val+" ");
        }
    }
}
