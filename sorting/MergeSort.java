package sorting;

public class MergeSort {

    /*
     * TC: O(nlog(n))
     * SC: O(n) - to store additional memory
     */
    static int[] mergesort(int[] arr){
         return mergeUtil(arr,0,arr.length-1);
    }

    static void printArray(int [] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    static int[] mergeUtil(int[] arr,int left,int right){

        if(left==right){
            return new int[]{arr[left]};
        }
        int mid = (left+right)/2;

        int[] left_arr = mergeUtil(arr, left, mid);
        int[] right_arr =mergeUtil(arr, mid+1, right);
    

        return merge(left_arr, right_arr);
    }

    static int[] merge(int[] left,int right[]){
        int i=0;
        int j=0;
        int k=0;
        int[] result = new int[left.length+right.length];

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                result[k]=left[i];
                i++;
                k++;
            }else{
                result[k]=right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
       
        int arr[]={1};
        
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
        arr= mergesort(arr);

        System.out.println("After sort");
        for(int val:arr)
            System.out.print(val+" ");
        
    }
}
