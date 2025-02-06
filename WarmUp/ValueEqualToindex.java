package WarmUp;

public class ValueEqualToindex {

    static int valueEqualToIndex(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1)
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(valueEqualToIndex(new int[]{15, 2, 45, 12, 7}));
        System.out.println(valueEqualToIndex(new int[]{1}));
        System.out.println(valueEqualToIndex(new int[]{5, 4}));
    }
}
