public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int start = 0;
        int end = 0;
        boolean [][] dp = new boolean[len][len];
        dp[0][0] = true;
        for(int i = 1; i<len; i++){
            dp[i][i] = true;
            dp[i][i-1] = true;
        }
        char []array = s.toCharArray();
        for(int i = 2; i<len+1; i++){
            for(int j = 0; j <= len-i; j++){
                if(array[j] == array[j+i-1] && dp[j+1][j+i-2]){
                    dp[j][j+i-1] = true;
                    if(end - start < i){
                        end = j+i-1;
                        start = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}
