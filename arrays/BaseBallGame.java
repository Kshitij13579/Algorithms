package arrays;

/*
 * https://leetcode.com/problems/baseball-game/
 */
public class BaseBallGame {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public int calPoints(String[] operations) {
        int record[]=new int[operations.length];
        int index=0;
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                sum-=record[index-1];
                index--;
            }else if(operations[i].equals("D")){
                record[index]=record[index-1]*2;
                sum+=record[index];
                index++;
            }else if(operations[i].equals("+")){
                record[index]=record[index-1]+record[index-2];
                sum+=record[index];
                index++;
            }else{
                record[index]=Integer.parseInt(operations[i]);
                sum+=record[index];
                index++;
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        
    }
}
