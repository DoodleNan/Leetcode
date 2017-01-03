public class Solution {
    public int countBattleships(char[][] board) {
        int result = 0;
        int row = board.length;
        if(row == 0) return result;
        int col = board[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(board[i][j] == 'X'){
                    int temp = j;
                    result++;
                    while(j+1<col && board[i][j+1] == 'X'){
                        board[i][j+1] = '.';
                        j++;
                    }
                    int index = i;
                    while(index+1<row && board[index+1][j] == 'X'){
                        board[index+1][j] = '.';
                        index++;
                    }
                    board[i][temp] = '.';
                }
            }
        }
        return result;
    }
}
