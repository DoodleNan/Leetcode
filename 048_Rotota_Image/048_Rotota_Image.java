public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null) return;
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 0 || col == 0) return;
        int [][] temp = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                temp[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j] = temp[row-j-1][i];
            }
        }
    }
}
