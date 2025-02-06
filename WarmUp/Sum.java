package WarmUp;

import java.util.Scanner;

public class Sum {
    
    static int arraySum(int[] arr){
        int sum=0;
        for(int val:arr){
            sum=sum+val;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(arraySum(arr));
    }
}
