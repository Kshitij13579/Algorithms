package arrays;

/*
 * https://leetcode.com/problems/distribute-candies/
 */
public class DistributeCandies {
    /*
     * TC: O(N)
     * SC: O(N)
     */
    public int distributeCandies(int[] candyType) {
        if(candyType.length==0){
            return 0;
        }
        int candy = 0;
        int size = candyType.length /2;
        boolean[] arr = new boolean[200001];
        for(int i: candyType){
            int j = i + 100000;
            if(!arr[j]){
                ++candy;
                arr[j] = true;
            }
            if(size == candy){
                return candy;
            }
        }

        return candy;
    }

    public static void main(String[] args) {
        
    }
}
