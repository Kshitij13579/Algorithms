package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] words) {
        int[] frequency=getFrequency(words[0]);

        for(int i=1;i<words.length;i++){
            int[] temp=getFrequency(words[i]);
            updateFrequency(frequency,temp);
        }

        List<String> result = new ArrayList<String>();
        for(int i=0;i<frequency.length;i++){
            while(frequency[i]>0){
                result.add(Character.toString(i+'a'));
                frequency[i]--;
            }
        }

        return result;

    }

    public int[] getFrequency(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        return freq;
    }

    public void updateFrequency(int[] a, int[] b){
        for(int i=0;i<26;i++){
            a[i]=Math.min(a[i],b[i]);
        }
    }


    public static void main(String[] args) {
        
    }
}
