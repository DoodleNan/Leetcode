public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0) return 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] dp = new int[rowLength][colLength];
        for(int i = 0; i<rowLength;i++){
            for(int j = 0;j<colLength;j++){
                dp[i][j]=-1;
            }
        }
        dp[0][0] = grid[0][0];
        compute(dp,grid,rowLength-1, colLength-1);
        return dp[rowLength-1][colLength-1];
    }
    
    public void compute(int[][]dp, int[][]grid, int row, int col){
        if(row < 0 || col < 0 || dp[row][col] >= 0) return;
        compute(dp,grid,row-1,col);
        compute(dp,grid,row,col-1);
        if(row == 0){
            dp[row][col] = dp[row][col-1]+grid[row][col];
        }else if(col == 0){
            dp[row][col] = dp[row-1][col]+grid[row][col];
        }else{
            dp[row][col] = Math.min(dp[row-1][col],dp[row][col-1]) + grid[row][col];
        }
    }
}
