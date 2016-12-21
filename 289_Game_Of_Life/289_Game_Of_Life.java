public class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                 int lives = compute(i,j,board);
                 if(board[i][j] == 0 && lives == 3) board[i][j] = 2;
                 if(board[i][j] == 1 && (lives == 3 || lives == 2) ) board[i][j] = 3;
            }
        }
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                board[i][j]>>=1;
            }
        }
    }
    
    private int compute(int i, int j, int [][] board){
        int row = board.length;
        int col = board[0].length;
        int result = 0;
        for(int x = Math.max(i-1, 0); x<=Math.min(i+1, row-1); x++){
            for(int y = Math.max(j-1,0); y<=Math.min(j+1, col-1); y++){
                result += board[x][y] & 1;
            }
        }
        result -= (int)board[i][j] & 1;
        return result;
    }

}
