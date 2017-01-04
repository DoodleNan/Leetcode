public class Solution {
    int [][]dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int row = matrix.length;
        if(row == 0) return result;
        int col = matrix[0].length;
        boolean [][]visited = new boolean[row][col];
        int i = 0; 
        int j = 0;
        int dirCount = 0;
        for(int count = 0; count<row*col; count++){
            visited[i][j] = true;
            result.add(matrix[i][j]);
            int newRow = i+dir[dirCount%4][0];
            int newCol = j+dir[dirCount%4][1];
            if(newRow>=row || newRow <0 || newCol>=col || newCol<0 || visited[newRow][newCol]){
                dirCount++;
            }
            i+=dir[dirCount%4][0];
            j+=dir[dirCount%4][1];
        }
        return result;
    }
}
