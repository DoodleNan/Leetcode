public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null) return;
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 0 || col == 0) return;
        for(int i = 0; i<row/2; i++){
            for(int j = i; j < col-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row-j-1][i];
                matrix[row-j-1][i] = matrix[row-1-i][col-j-1];
                matrix[row-1-i][col-1-j] = matrix[j][col-i-1];
                matrix[j][col-i-1] = temp;
            }
        }
    }
}
