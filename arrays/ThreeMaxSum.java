package arrays;

public class ThreeMaxSum {
    
    /*
     * Print largest three numbers considering array can have duplciates. 
     * TC: O(N)
     * SC: O(1)
     */
    static void threeMaxSum(int[] arr,int n){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        if(arr.length<3){
            System.out.println("Invalid Input");
            return;
        }

        for(int val:arr){
            if(val>first){
                third=second;
                second=first;
                first=val;
            }
            else if(val > second){
                third=second;
                second=val;
            }else if(val > third){
                third=val;
            }
        }

        System.out.println(first+" "+second+" "+third);
    }
    
    public static void main(String[] args) {
        threeMaxSum(new int[]{1,1},2); //Invalid
        threeMaxSum(new int[]{1,1,2,2},4); //2 2 1
        threeMaxSum(new int[]{1,1,1,5,6},5); // 6 5 1
        threeMaxSum(new int[]{1,3,2,7},4); // 7 3 2 
        threeMaxSum(new int[]{1,1,2,2,3,3},6); // 3 3 2
        threeMaxSum(new int[]{1,3,5,6,7,9,90},7); // 90 9 7
        threeMaxSum(new int[]{0,1,0,1},4); //1 1 0
        threeMaxSum(new int[]{1,2,3},3); // 3 2 1
    }
}
