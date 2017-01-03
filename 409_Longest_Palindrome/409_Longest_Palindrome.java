public class Solution {
    public int longestPalindrome(String s) {
        int []count = new int[52];
        for(char c:s.toCharArray()){
            if(c-'a'>=0){
                count[c-'a'+26]++;
            }else{
                count[c-'A']++;
            }
        }
        int result = 0;
        for(int i:count){
            result += i/2*2;
        }
        return result == s.length()?result:result+1;
    }
}
