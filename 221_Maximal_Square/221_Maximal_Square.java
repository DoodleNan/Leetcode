public class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if(row == 0) return 0;
        int col = matrix[0].length;
        int [][]dp = new int[row][col];
        int result = 0;
        for(int i = 0; i<row; i++){
            dp[i][0] = matrix[i][0]-'0';
            if(dp[i][0]>0) result = 1;
        }
        for(int i = 0; i<col; i++){
            dp[0][i] = matrix[0][i]-'0';
            if(dp[0][i]>0) result = 1;
        }
        for(int i = 1; i<row; i++){
            for(int j = 1; j<col; j++){
                if(matrix[i][j] == '0') dp[i][j] = 0;
                else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
                }
                if(dp[i][j] > result) result = dp[i][j];
            }
        }
        return result*result;
    }
}
