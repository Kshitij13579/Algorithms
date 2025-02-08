package arrays;

public class ReverseArrayInplace {
    
    static void reverse(int[] arr,int n){

        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4},4);
        reverse(new int[]{1,2,3,4,5},5);
        reverse(new int[]{1},1);
        reverse(new int[]{1,2},2);
    }
}
