package sorting;

public class CountingSort {

    /*
     * TC: O(n+k) : n is the length of input array and k is the range of the input
     * SC: O(n+k) : n is the length of input array and k is the range of the input
     */
    public static void countingSort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            max=Math.max(val, max);
        }

        int[] frequency=new int[max+1];
        //count frequency
        for(int val:arr){
            frequency[val]++;
        }

        //cumulative sum
        for(int i=1;i<frequency.length;i++){
            frequency[i]+=frequency[i-1];
        }

        int[] output=new int[arr.length];

        for(int i=output.length-1;i>=0;i--){
            output[frequency[arr[i]]-1]=arr[i];
            frequency[arr[i]]--;
        }

        printArray(output);
    }

    public static void printArray(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        countingSort(new int[]{1,0,3,1,3,1});
        countingSort(new int[]{9,0,3,1,3,1});
    }
}
