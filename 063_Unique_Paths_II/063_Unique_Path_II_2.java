public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid.length;
        if(rowLength == 0) return 0;
        int colLength = obstacleGrid[0].length;
        int[][] dp = new int[rowLength][colLength];
        for(int i = 0;i<colLength;i++){
            if(obstacleGrid[0][i] != 1) dp[0][i] = 1;
            else break;
        }
        for(int i = 0; i<rowLength; i++){
            if(obstacleGrid[i][0] != 1) dp[i][0] = 1;
            else break;
        }
        for(int i = 1; i<rowLength; i++){
            for(int j = 1; j<colLength;j++){
                if(obstacleGrid[i][j] != 1) dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[rowLength-1][colLength-1];
    }
}
