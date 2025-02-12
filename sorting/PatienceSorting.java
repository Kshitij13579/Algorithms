package sorting;

import java.util.ArrayList;
import java.util.Stack;

public class PatienceSorting {
    
    /*
     * TC:O(N^2)
     * SC: O(N)
     */
    static void patienceSorting(int[] arr){
        ArrayList<Stack<Integer>> piles = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(piles.isEmpty()){
                Stack<Integer> temp=new Stack<>();
                temp.push(arr[i]);
                piles.add(temp);
            }else{ 
                boolean flag=true;
                for(int j=0;j<piles.size();j++){
                    if(arr[i]<=piles.get(j).peek()){
                        flag=false;
                        piles.get(j).push(arr[i]);
                        break;
                    }
                }

                if(flag){
                    Stack<Integer> temp=new Stack<>();
                    temp.push(arr[i]);
                    piles.add(temp);
                }
            }

        }

        //empty all the piles retrieving minimum from each pile one by one
        while(true){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<piles.size();i++){
                if(piles.get(i).peek()<min){
                    min = piles.get(i).peek();
                    index=i;
                }
            }

            System.out.print(min+" ");
            piles.get(index).pop();

            if(piles.get(index).isEmpty())
                piles.remove(index);

            if(piles.isEmpty())
                break;
        } 
        System.out.println();

    }

    static void print(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        patienceSorting(new int[]{9,8,7,5,6,4,3,2,1});
        patienceSorting(new int[]{1});
        patienceSorting(new int[]{5,5,6,7,8,20,34,5,8,22});
    }
}
