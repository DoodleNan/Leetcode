public class Solution {
    int [][]dir = {{1,0},{-1,0}, {0,1},{0,-1}};
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int row = grid.length;
        if(row == 0) return result;
        int col = grid[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                    for(int k = 0; k<4; k++){
                        int x = i+dir[k][0];
                        int y = j+dir[k][1];
                        if(x<0||x>=row||y<0||y>=col) result++;
                        if(x>=0 && x <row && y>=0 && y <col && grid[x][y] == 0) result++;
                    }
                }
            }
        }
        return result;
    }
}
