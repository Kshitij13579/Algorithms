package WarmUp;

public class MinValueToBalance {
    
    static int minValToBalance(int[] arr){
        int sum_left=0;
        int sum_right=0;

        for(int i=0;i<arr.length/2;i++){
            sum_left+=arr[i];
        }

        for(int i=arr.length/2;i<arr.length;i++){
            sum_right+=arr[i];
        }

        return Math.abs(sum_left-sum_right);
    }
    public static void main(String[] args) {
        System.out.println(minValToBalance(new int[]{1, 5, 3, 2}));
        System.out.println(minValToBalance(new int[]{1, 2, 1, 2, 1, 3 }));
    }
}
