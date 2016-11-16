public class NumMatrix {
    private int[][] dp;
    public NumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        dp = new int[row][col];
        dp[0][0] = matrix[0][0];
        for(int i = 1; i<col; i++) dp[0][i] = dp[0][i-1] + matrix[0][i];
        for(int i = 1; i<row; i++) dp[i][0] = dp[i-1][0] + matrix[i][0];
        for(int i = 1; i<row; i++){
            for(int j = 1; j<col; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0){
            if(col1 == 0) return dp[row2][col2];
            else return dp[row2][col2] - dp[row2][col1-1];
        }else if(col1 == 0){
            return dp[row2][col2] - dp[row1-1][col2];
        }else return dp[row2][col2] - dp[row1-1][col2] - dp[row2][col1-1] + dp[row1-1][col1-1];
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);
