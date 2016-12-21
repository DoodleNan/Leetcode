public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean [][]matrix = new boolean[numCourses][numCourses];
        int []indegree = new int[numCourses];
        Queue <Integer> q = new LinkedList<Integer>();
        int count = 0;
        for(int i = 0; i<prerequisites.length; i++){
            int cur = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if(!matrix[pre][cur]){
                matrix[pre][cur] = true;
                indegree[cur]++;
            }
        }
        boolean []visited = new boolean[numCourses];
        // for(int i = 0; i<numCourses; i++){
        //     if(!dfs(visited,i,matrix)) return false;
        // }
        // return true;
        for(int i = 0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(q.size()!=0){
            int temp = (int)q.poll();
            count++;
            for(int i = 0; i<numCourses; i++){
                if(matrix[temp][i]){
                    indegree[i]--;
                    if(indegree[i] == 0){
                        q.offer(i);
                    }
                }
            }
        }
        return count == numCourses;
    }
    
    private boolean dfs(boolean []visited, int course, boolean [][]matrix){
        if(visited[course]) return false;
        visited[course] = true;
        for(int i = 0; i<visited.length; i++){
            if(matrix[course][i]){
                if(!dfs(visited, i, matrix)) return false;
            }
        }
        visited[course] = false;
        return true;
    }
}
