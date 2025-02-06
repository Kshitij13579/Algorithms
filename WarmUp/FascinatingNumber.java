package WarmUp;

public class FascinatingNumber {
    
    static String isFascinatingNumber(int n){

        if(n<100)
            return "Not Fascinating";
        
        String num = ""+n+(n*2)+(n*3);

        boolean[] visited=new boolean[9];

        for(int i=0;i<num.length();i++){
            int digit = num.charAt(i) - '0';

            if(digit==0 || visited[digit-1])
                return "Not Fascinating";
            else
                visited[digit-1]=true;
        }

        for(boolean b:visited){
            if(!b)
                return "Not Fascinating";
        }

        return "Fascinating";

    }
    public static void main(String[] args) {
        System.out.println(isFascinatingNumber(192));
        System.out.println(isFascinatingNumber(853));
    }
}
