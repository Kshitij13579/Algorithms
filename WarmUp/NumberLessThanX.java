package WarmUp;

public class NumberLessThanX {
    
    static int countLessThan(int[] arr,int x){
        int count=0;
        for(int val:arr){
            if(val<=x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countLessThan(new int[]{}, 9));
        System.out.println(countLessThan(new int[]{1,2,3,4,5,6,7,8,9,10}, 9));
        System.out.println(countLessThan(new int[]{1, 2, 4, 5, 8, 10}, 9));
    }
}
