public class Solution {
    int [][]dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public int[][] generateMatrix(int n) {
        int [][]result = new int[n][n];
        int i = 0; 
        int j = 0;
        int dirCount = 0;
        for(int count = 1; count<=n*n;count++){
            result[i][j] = count;
            int newRow = i+dir[dirCount%4][0];
            int newCol = j+dir[dirCount%4][1];
            if(newRow<0||newRow>=n||newCol<0||newCol>=n||result[newRow][newCol]>0){
                dirCount++;
            }
            i+=dir[dirCount%4][0];
            j+=dir[dirCount%4][1];
        }
        return result;
    }
}
