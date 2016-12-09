public class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        if(row == 0) return false;
        int col = board[0].length;
        boolean [][]visited = new boolean[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(dfs(board, visited, i,j,0, word)) return true;
            }
        }
        return false;
    }
    
    private boolean dfs(char[][]board, boolean[][]visited, int i, int j, int index, String word){
        if(index == word.length()) return true;
        if(i<0 || i >= board.length || j<0 || j>=board[0].length || visited[i][j]) return false;
        if(board[i][j] != word.charAt(index)) return false;
        visited[i][j] = true;
        boolean b = dfs(board, visited, i-1,j,index+1, word) || dfs(board, visited, i+1,j,index+1, word) || dfs(board, visited, i,j-1,index+1, word) ||dfs(board, visited, i,j+1,index+1, word);
        visited[i][j] = false;
        return b;
    }
}
