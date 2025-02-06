package WarmUp;

public class AlternateOrderArray {
    
    static void alternateOrder(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        alternateOrder(new int[]{1,2,3,4});
        System.out.println();
        alternateOrder(new int[]{1,2,3,4,5});
        System.out.println();
        alternateOrder(new int[]{1});
    }
}
