public class Solution {
    public int numDistinct(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        int [][]dp = new int[lent+1][lens+1];
        for(int i = 0; i<=lens; i++){
            dp[0][i] = 1;
        }
        
        for(int i = 1; i<=lent; i++){
            dp[i][0] = 0;
        }
        
        for(int i = 0; i<lent; i++){
            for(int j = 0; j<lens; j++){
                if(s.charAt(j) == t.charAt(i)){
                    dp[i+1][j+1] = dp[i][j] + dp[i+1][j];
                }else{
                    dp[i+1][j+1] = dp[i+1][j];
                }
            }
        }
        return dp[lent][lens];
    }
}
