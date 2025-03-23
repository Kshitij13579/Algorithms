package arrays;

/*
 * https://leetcode.com/problems/crawler-log-folder/description/
 */
public class CrawlLogFolder {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public int minOperations(String[] logs) {
        int distancefromMain=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                distancefromMain=Math.max(0,distancefromMain-1);
            }else if(logs[i].equals("./")){
                continue;
            }else{
                distancefromMain++;
            }
        }

        return distancefromMain;
    }
    
    public static void main(String[] args) {
        
    }
}
