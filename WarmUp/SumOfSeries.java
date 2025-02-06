package WarmUp;

public class SumOfSeries {
    
    static int sumOfSeries(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
        System.out.println(sumOfSeries(1));
    }
}
