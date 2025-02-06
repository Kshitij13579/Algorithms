package WarmUp;

public class PerfectArray {
    
    static String isPerfectArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return "NOT PERFECT";
            }
        }
        return "PERFECT";
    }
    public static void main(String[] args) {
        System.out.println(isPerfectArray(new int[]{1, 2, 3, 2, 1}));
        System.out.println(isPerfectArray(new int[]{1, 2, 3, 2, 1,6}));
        System.out.println(isPerfectArray(new int[]{1, 2, 3, 3, 2,1}));
    }
}
