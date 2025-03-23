package arrays;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/unique-email-addresses/description/
 */
public class UniqueEmailAddress {
    
    /*
     * Time Complexity: O(m*n) where m is the length of email array and n is the length of each email string.
     * Space Complexity: O(N)
     */
    public String convertToValidEmail(String email){
        StringBuffer sb=new StringBuffer();
        boolean plusFlag=false;
        boolean atTheRateFlag=false;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                plusFlag=false;
                atTheRateFlag=true;
            }
            if(!atTheRateFlag && (email.charAt(i)=='.' || plusFlag))
                continue;
            if(email.charAt(i)=='+'){
                plusFlag=true;
                continue;
            }
            sb.append(email.charAt(i));
        }

        return sb.toString();
    }

    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails=new HashSet();

        for(int i=0;i<emails.length;i++){
            String t=convertToValidEmail(emails[i]);
            uniqueEmails.add(t);
        }

        return uniqueEmails.size();
    }
    
    public static void main(String[] args) {
        
    }
}
