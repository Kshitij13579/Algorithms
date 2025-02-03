package recursion;

public class Factorial {
    
    /*
     * Contrainsts n>=0
     * TC: O(N) - N times calling the function
     * SC: O(N) - recursion stack
     */
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(5));
    }
}
