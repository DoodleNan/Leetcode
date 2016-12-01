public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] dp = new int[rowLength][colLength];
        dp[0][0] = grid[0][0];
        for(int i = 1; i<colLength; i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        
        for(int i = 1; i<rowLength; i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        
        for(int i = 1; i<rowLength; i++){
            for(int j = 1; j<colLength; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[rowLength-1][colLength-1];
    }
}
