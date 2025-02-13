package SlidingWindow;

import java.util.HashSet;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LongestSubstringUniqueCharacters {
    
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        int res=0;
        int i=0;
        int j=0;
        int max=0; //max length of longest substring with unique character
        int start=i;
        HashSet<Character> set =new HashSet<>();
        while(j<s.length() && i<=j){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            
            if(set.size()>max){
                max=set.size();
                start=i;
            }

            j+=1;
        }
        System.out.println("Longest Substring:"+s.substring(start,max));
        return max;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
