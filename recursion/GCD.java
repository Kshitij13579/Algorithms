package recursion;

public class GCD {
    
    /*
     * TC: O(log(min(a,b)))
     * SC: O(log(min(a,b)))
     */
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(0, 1));
        System.out.println(gcd(6, 4));
        System.out.println(gcd(10, 15));
    }
}
