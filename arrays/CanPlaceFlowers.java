package arrays;

/*
 * https://leetcode.com/problems/can-place-flowers/
 */
public class CanPlaceFlowers {
    
    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int newFlower=0;
        if(flowerbed.length==0)
            return true;
        if(flowerbed.length==1 && flowerbed[0]==0)
            newFlower++;
        if(flowerbed.length>=2 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            newFlower++;
        }
            

        for(int i=1;i<flowerbed.length-1;i++){
           if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                newFlower++;
           }
        }

        if(flowerbed.length>2 && flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            newFlower++;
        }

        return newFlower>=n;
    }
    
    public static void main(String[] args) {
        
    }
}
