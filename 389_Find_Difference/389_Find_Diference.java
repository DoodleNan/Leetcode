public class Solution {
    public char findTheDifference(String s, String t) {
        int []count = new int[26];
        for(char c : s.toCharArray()) count[c-'a']++;
        for(char c: t.toCharArray()){
            count[c-'a']--;
        }
        int i = 0;
        for(; i<26; i++){
            if(count[i]<0) break;
        }
        return (char)(i+'a');
    }
}
