public class Solution {
    int [][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new ArrayList<int[]>();
        int row = matrix.length;
        if(row == 0) return result;
        int col = matrix[0].length;
        boolean [][]pvisited = new boolean[row][col];
        boolean [][]avisited = new boolean[row][col];
        Queue<int[]> pq = new LinkedList<int[]>();
        Queue<int[]> aq = new LinkedList<int[]>();
        for(int i = 0; i<row; i++){
            pvisited[i][0] = true;
            avisited[i][col-1] = true;
            pq.offer(new int[]{i,0});
            aq.offer(new int[]{i,col-1});
        }
        
        for(int i = 0; i<col; i++){
            pvisited[0][i] = true;
            avisited[row-1][i] = true;
            pq.offer(new int[]{0,i});
            aq.offer(new int[]{row-1,i});
        }
        
        bfs(pq,pvisited,matrix);
        bfs(aq,avisited,matrix);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(pvisited[i][j] && avisited[i][j]) result.add(new int[]{i,j});
            }
        }
        return result;
    }
    
    private void bfs(Queue<int []> q, boolean [][]visited, int[][]matrix){
        while(q.size()!=0){
            int []cur = q.poll();
            for(int[] d : dir){
                int x = cur[0]+d[0];
                int y = cur[1]+d[1];
                if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length 
                && !visited[x][y] && matrix[x][y]>=matrix[cur[0]][cur[1]]){
                    visited[x][y] = true;
                    q.offer(new int[]{x,y});
                }
            }
        }
    }
}
