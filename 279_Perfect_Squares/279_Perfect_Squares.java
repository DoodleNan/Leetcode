public class Solution {
    public int numSquares(int n) {
         int dp[] = new int[n+1];
         dp[0] = 0;
         dp[1] = 1;
         for(int i = 2; i<=n; i++){
             int min = i;
             for(int j = 1; j*j<=i; j++){
                 if(j*j==i){
                     min = 1;
                     break;
                 }
                 min = Math.min(min, dp[i-j*j]+1);
             }
             dp[i] = min;
         }
         return dp[n];
    }
}
