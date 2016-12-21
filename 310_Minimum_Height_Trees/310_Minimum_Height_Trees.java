public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> [] graph = new ArrayList[n];
        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i<edges.length; i++){
            int fir = edges[i][0];
            int sec = edges[i][1];
            graph[fir].add(sec);
            graph[sec].add(fir);
        }
        boolean []visited = new boolean[n];
        for(int i = 0; i<n; i++){
            int height = bfs(i, visited, graph);
            hm.put(i,height);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry e1, Map.Entry e2){
                return (int)e1.getValue() - (int)e2.getValue();
            }
        });
        
        Map.Entry max = (Map.Entry)list.get(0);
        for(Map.Entry e : list){
            if((int)e.getValue() == (int)max.getValue())
            result.add((int)e.getKey());
        }
        return result;
    }
    
    private int bfs(int course, boolean []visited, ArrayList<Integer>[] graph){
        visited[course] = true;
        int temp = 0;
        for(int i = 0; i<graph[course].size(); i++){
            int cur = (int)graph[course].get(i);
            if(!visited[cur]){
                int childHeight = bfs(cur, visited, graph);
                if(childHeight > temp) temp = childHeight;
            }
        }
        visited[course] = false;
        return 1 + temp;
    }
}
