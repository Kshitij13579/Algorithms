package WarmUp2;
/*
 * Reverse a number and number can be negative
 */
public class ReverseNumber {
    static long reverse(long n){
        long rev=0;
        byte sign = 1;
        if(n<0)
            sign=-1;
        n=Math.abs(n);
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return sign*rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(10));
        System.out.println(reverse(321));
        System.out.println(reverse(-3214));
        System.out.println(reverse(200));
        System.out.println(reverse(Long.parseLong("2382328328882")));
        System.out.println(reverse(Long.parseLong("-2382328328882")));
    }
}
