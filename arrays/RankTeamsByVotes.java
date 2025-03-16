package arrays;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/rank-teams-by-votes/description/
 */
public class RankTeamsByVotes {
    
    /*
     * TC: O(N*M + NlogN) where M is votes.length and N is votes[i].length
     * SC: O(26*N+N)
     */
    public String rankTeams(String[] votes) {
        int n=votes[0].length();

        int[][] frequency = new int[26][n];

        for(int i=0;i<votes.length;i++){
            for(int j=0;j<votes[i].length();j++){
                frequency[votes[i].charAt(j)-'A'][j]++;
            }
        }

        Character temp[]=new Character[n];

        for(int i=0;i<n;i++){
            temp[i]=votes[0].charAt(i);
        }

        Arrays.sort(temp,(a,b)->{
            int indexA=a-'A';
            int indexB=b-'A';
            
            for(int i=0;i<n;i++){
                int diff=frequency[indexA][i]-frequency[indexB][i];
                if(diff!=0){
                    return diff > 0?-1:1;
                }
            }
            return a-b;
        });

        StringBuilder sb=new StringBuilder();
        for(char ch:temp){
            sb.append(ch);
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        
    }
}
