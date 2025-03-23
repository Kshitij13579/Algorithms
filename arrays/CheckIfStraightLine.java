package arrays;

/*
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 */
public class CheckIfStraightLine {
    
    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int dx=coordinates[1][0]-coordinates[0][0];
        int dy=coordinates[1][1]-coordinates[0][1];

        for(int i=2;i<coordinates.length;i++){
            if(dx*(coordinates[i][1]-coordinates[0][1])!=(dy*(coordinates[i][0]-coordinates[0][0])))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
