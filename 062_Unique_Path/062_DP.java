public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) return 0;
        int dp[][] = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                compute(dp,i,j);
            }
        }
        
        return dp[m-1][n-1];
    }
    
    public void compute(int[][] dp, int row, int col){
        if(row < 0 || col < 0 || dp[row][col]>0) return;
        compute(dp,row-1,col);
        compute(dp,row,col-1);
        if(row == 0) dp[row][col] = dp[row][col-1];
        else if(col == 0) dp[row][col] = dp[row-1][col];
        else dp[row][col] = dp[row][col-1] + dp[row-1][col];
    }

}
