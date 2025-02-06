package WarmUp;

import java.util.Scanner;

public class PrintIndexArray {

    static void retrieveIndex(int[] arr,int index){
        if(index >=0 && index < arr.length)
            System.out.println(arr[index]);
        else{
            System.out.println("Invalid Index");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int index = sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        retrieveIndex(arr,index);
    }
}
