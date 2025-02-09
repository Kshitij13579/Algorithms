package sorting;

public class QuickSort {

    
    public static int partition(int[] arr,int left,int right){
        int pivot = arr[right];

        int i=left-1;
        
        for(int j=left;j<=right-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, right);
        return i+1;
    }

    public static void quicksort(int[] arr,int left,int right){
        if(left<right){
            int pivotIndex= partition(arr, left, right);

            quicksort(arr, left, pivotIndex-1);
            quicksort(arr, pivotIndex+1, right);
        }
    }

    
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }



    public static void main(String[] args) {
        int[] arr=new int[]{987,456,33,2,1,678};
        int[] arr1=new int[]{1};
        quicksort(arr, 0, arr.length-1);
        quicksort(arr1, 0, arr1.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        for(int val:arr1){
            System.out.print(val+" ");
        }
        System.out.println();

    }
}
