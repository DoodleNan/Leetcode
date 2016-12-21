public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        ArrayList []graph = new ArrayList[numCourses];
        int count = 0;
        int []indegree = new int[numCourses];
        for(int i = 0; i<numCourses; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i<prerequisites.length; i++){
            int cur = prerequisites[i][0];
            int pre = prerequisites[i][1];
            graph[pre].add(cur);
            indegree[cur]++;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i<numCourses; i++){
            if(indegree[i]==0) q.offer(i);
        }
        int index = 0;
        while(q.size()!=0){
            int pre = (int)q.poll();
            result[index++] = pre;
            count++;
            for(int i = 0; i<graph[pre].size(); i++){
                int cur = (int)graph[pre].get(i);
                indegree[cur]--;
                if(indegree[cur] == 0) q.offer(cur);
            }
        }
        if(count == numCourses) return result;
        else return new int[0];
    }
}
