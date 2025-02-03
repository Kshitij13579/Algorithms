package recursion;
/*
 * Program to find the Nth Fibonacci number
 * F(n)=F(n−1)+F(n−2) for n≥2
 */
public class Fibonnaci {
    
    /*
     * TC: O(2^N): almost 2^N iterations for given number as the function is called
     *              twice in recursion. 
     * SC: O(N): recursion stack
     */
    static int fibonnaciRecursion(int n){
        if(n<2)
            return n;
        return fibonnaciRecursion(n-1)+fibonnaciRecursion(n-2);
    }

    /*
     * TC: O(N) : the loop runs from 2 to n, performing constant time operations in each iteration
     * SC: O(1) : only a constant amount of extra space is used to store the current and two previous Fibonacci numbers.
     */
    static int fibonnaciIterative(int n){
        int a=0;
        int b=1;

        if(n==0)
            return a;
        if(n==1)
            return b;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }

        return b;
    }

    /*
     * using matrix multiplication
     * [1,1     [F(n),F(n-1)
     *  1,0]^n-1  =  F(n-1),F(n-2)]
     *  
     * TC: O(log(n)) - iteration happening for half the number of N
     * SC: O(log(n)) - multiplyMatrix is executed almost logn times.
     */

     static int fibonnaciMatrixExponentiation(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        int[][] mat={{1,1},{1,0}};
        int[][] result={{1,0},{0,1}};

        while(n>0){
            if(n%2==1)
                multiplyMatrix(result, mat);
            
            multiplyMatrix(mat, mat);
            n=n/2;
        }

        return result[0][1];
     }

     static void multiplyMatrix(int[][] mat1,int[][] mat2){
        int a = mat1[0][0]*mat2[0][0] + mat1[0][1]*mat2[1][0];
        int b = mat1[0][0]*mat2[0][1] + mat1[0][1]*mat2[1][1];
        int c = mat1[1][0]*mat2[0][0] + mat1[1][1]*mat2[1][0];
        int d = mat1[1][0]*mat2[0][1] + mat1[1][1]*mat2[1][1];

        mat1[0][0]=a;
        mat1[0][1]=b;
        mat1[1][0]=c;
        mat1[1][1]=d;
     }

    public static void main(String[] args) {
        System.out.println(fibonnaciRecursion(0));
        System.out.println(fibonnaciRecursion(4));
        System.out.println(fibonnaciRecursion(5));
        System.out.println(fibonnaciRecursion(7));
        System.out.println();

        System.out.println(fibonnaciIterative(0));
        System.out.println(fibonnaciIterative(4));
        System.out.println(fibonnaciIterative(5));
        System.out.println(fibonnaciIterative(7));

        System.out.println();

        System.out.println(fibonnaciMatrixExponentiation(0));
        System.out.println(fibonnaciMatrixExponentiation(4));
        System.out.println(fibonnaciMatrixExponentiation(5));
        System.out.println(fibonnaciMatrixExponentiation(7));
        System.out.println(fibonnaciMatrixExponentiation(6));

    }
}
