package arrays;

public class AddBinary {

    /*
     * TC: O(N) - where N is the length of the larger string
     * SC: O(N)
     */
    public String addBinary(String a, String b) {
        
        if(a.length()>b.length()){
            String temp=a;
            a=b;
            b=temp;
        }
        
        char[] res=new char[b.length()+1];
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        
        while(j>=0){
            int aChar= i>=0 ? a.charAt(i--)-'0':0;
            int bChar=b.charAt(j)-'0';

            sum=aChar+bChar+carry;
            carry=sum/2;
            sum=sum%2;
            res[j+1]=(char)(sum+'0');
            j--;
        }

        if(carry==0)
            return new String(res,1,res.length-1);
        res[0]='1';
        return new String(res);
    }

}
