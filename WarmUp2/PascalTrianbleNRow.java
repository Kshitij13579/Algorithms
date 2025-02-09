package WarmUp2;

import java.util.ArrayList;

/*
 * ith element of nth row in pascal triangle is nCi = n!/i!*(n-i)!
 */
public class PascalTrianbleNRow {

    static ArrayList<Integer> nthRowPascalTriangle(int n){
      
        if(n==1){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }

        ArrayList<Integer> previousRow = nthRowPascalTriangle(n-1);

        ArrayList<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for(int i=1;i<n-1;i++){
            currentRow.add(previousRow.get(i)+previousRow.get(i-1));
        }

        currentRow.add(1);

        return currentRow;
    }

    static void printRow(int n){
        ArrayList<Integer> arr= nthRowPascalTriangle(n);

        for (Integer object : arr) {
            System.out.print(object+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printRow(1);
        printRow(2);
        printRow(3);
        printRow(4);
        printRow(5);
        printRow(20);
    }
}
