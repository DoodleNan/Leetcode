public class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int result = 0;
        int maxCount = 0;
        int []count = new int[26];
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'A']++;
            if(count[s.charAt(i)-'A'] > maxCount) maxCount = count[s.charAt(i)-'A'];
            while(i-start+1-maxCount>k){
                count[s.charAt(start++)-'A']--;
                maxCount = 0;
                for(int j = 0; j<26; j++){
                    if(count[j] > maxCount) maxCount = count[j];
                }
            }
            if(i-start+1>result) result = i-start+1;
        }
        return result;
    }
}
