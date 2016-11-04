public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid.length;
        if(rowLength == 0) return 0;
        if(obstacleGrid[0][0] == 1) return 0;
        int colLength = obstacleGrid[0].length;
        int[][] dp = new int[rowLength][colLength];
        dp[0][0] = 1;
        for(int i = 0; i<rowLength; i++){
            for(int j = 0; j<colLength;j++){
                compute(obstacleGrid,dp,i,j);
            }
        }
        return dp[rowLength-1][colLength-1];
    }
    
    public void compute(int[][] grid, int[][]dp, int row, int col){
        if(row < 0 || col < 0 || dp[row][col] > 0) return;
        if(grid[row][col] == 1) {
            return;
        }
        compute(grid, dp, row-1, col);
        compute(grid, dp, row, col-1);
        if(row == 0 && dp[row][col-1] != 0) dp[row][col] = dp[row][col-1];
        if(col == 0 && dp[row-1][col] != 0) dp[row][col] = dp[row-1][col];
        if(row != 0 && col != 0){
            dp[row][col] = dp[row][col-1]+dp[row-1][col];
        }
    }
}
