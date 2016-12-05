public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board.length!=9 || board[0].length!=9) return false;
        boolean []flag = new boolean[10];
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                char c = board[i][j];
                if(c == '.') continue;
                else if(c<='9' && c>='1'){
                    if(flag[c-'0']) return false;
                    else flag[c-'0'] = true;
                }else return false;
            }
            for(int t = 0; t<10; t++) flag[t] = false;
        }
        
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                char c = board[j][i];
                if(c == '.') continue;
                else if(c<='9' && c>='1'){
                    if(flag[c-'0']) return false;
                    else flag[c-'0'] = true;
                }else return false;
            }
            for(int t = 0; t<10; t++) flag[t] = false;
        }
        
        for(int i = 0; i<9; i=i+3){
            for(int j = 0; j<9; j=j+3){
                for(int m = 0; m<3; m++){
                    for(int n = 0; n<3; n++){
                        char c = board[i+m][j+n];
                        if(c == '.') continue;
                        else if(c<='9' && c>='1'){
                            if(flag[c-'0']) return false;
                            else flag[c-'0'] = true;
                        }else return false;
                    }
                }
                for(int t = 0; t<10; t++) flag[t] = false;
            }
        }
        return true;
    }
}
