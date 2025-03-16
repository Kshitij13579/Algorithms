package arrays;

/*
 * https://leetcode.com/problems/next-greater-element-iii/
 */
public class NextGreaterElement3 {

    /*
     * TC:O(N)
     * SC:O(N)
     */
    public int nextGreaterElement(int n) {
        char[] arr=Integer.toString(n).toCharArray();
        StringBuilder sb=new StringBuilder();
        /*find the digit from end such that arr[i] < arr[i+1]
        * find the index where the increasing order from end is broken
        */
        int i=arr.length-2;

        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        //no solution exists as the digits are in decending order
        if(i==-1)
            return -1;

        /*
        * smallest digit from end which is greater than ith index
        */
        int k=arr.length-1;

        while(k>=0 && arr[k]<=arr[i])
            k--;

        //swap index i and k
        char temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;

        //get digits from 0 to index i
        for(int j=0;j<=i;j++){
            sb.append(arr[j]);
        }
        //get digits from i+1 to end in sorted order.
        for(int j=arr.length-1;j>i;j--){
            sb.append(arr[j]);
        }
        //check if integer overflow
        long ans=Long.parseLong(sb.toString());
        if(ans > Integer.MAX_VALUE)
            return -1;
        return (int)ans;
        
    }

    public static void main(String[] args) {
        
    }
}
