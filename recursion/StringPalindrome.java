package recursion;

public class StringPalindrome {
    /*
     * Two pointer approach
     * TC:O(N/2): where n is the length of the input string.
     * SC:O(1): no extra data structure used
     */
    static boolean isPalindrome(String s){
        if(s.isEmpty())
            return true;
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    /*
     * TC: O(N/2): where n is the length of the input string.
     * SC: O(N/2) : recursion stack
     */
    static boolean isPalindromeRecursion(String s){
        if(s.isEmpty())
            return true;
        int left=0;
        int right=s.length()-1;
        return isPalindromeUtil(s,left,right);
    }

    static boolean isPalindromeUtil(String s,int left,int right){
        if(left>=right)
            return true;
        if(s.charAt(left)!=s.charAt(right))
            return false;    
        return isPalindromeUtil(s, left+1, right-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("a"));
        System.out.println();

        System.out.println(isPalindromeRecursion("abba"));
        System.out.println(isPalindromeRecursion(""));
        System.out.println(isPalindromeRecursion("abcd"));
        System.out.println(isPalindromeRecursion("a"));
    }
}
