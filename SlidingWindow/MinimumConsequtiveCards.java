package SlidingWindow;

import java.util.HashMap;

public class MinimumConsequtiveCards {

     public static int minimumCardPickup(int[] cards) {
        if(cards.length<=1)
            return -1;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap();
        int res=Integer.MAX_VALUE;
        while(j<cards.length){
            map.put(cards[j],map.getOrDefault(cards[j],0)+1);

            //pair is found
            while(map.get(cards[j])==2){
                res=Math.min(res,j-i+1);
                map.put(cards[i],map.get(cards[i])-1);
                i+=1;
            }
            j+=1;
        }
        
        if(res==Integer.MAX_VALUE)
            return -1;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumCardPickup(new int[]{3,1,3,1,2,5,6,7}));
    }
}
