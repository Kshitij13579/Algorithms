package arrays;

/*
 * https://leetcode.com/problems/multiply-strings/description/
 */
public class MultiplyStrings {
   /*
        TC:O(M+N)
        SC:O(M+N)
    */
    public String multiply(String num1, String num2) {
        
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int[] multiply=new int[num1.length()+num2.length()];

        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                multiply[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                multiply[i+j]+=multiply[i+j+1]/10;
                multiply[i+j+1]%=10;
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int i:multiply){
            if(sb.length()==0 && i==0)
                continue;
            sb.append(i);
        }

        return sb.toString();
    }
}
