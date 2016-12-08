public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        boolean []rowflag = new boolean[row];
        boolean []colflag = new boolean[col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0){
                    rowflag[i] = true;
                    colflag[j] = true;
                }
            }
        }
        
        for(int i = 0; i<row; i++){
            if(rowflag[i]){
                for(int j = 0; j<col; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i<col; i++){
            if(colflag[i]){
                for(int j = 0; j<row; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
