public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(edges.length == 0){
            List<Integer> result = new ArrayList<Integer>(n);
            for(int i = 0; i<n; i++){
                result.add(i);
            }
            return result;
        }
        
        List<Integer> result = new ArrayList<Integer>(n);
        for(int i = 0; i<n; i++) result.add(i);
        List<Set<Integer>> graph = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            graph.add(new HashSet<Integer>());
        }
        for(int []edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            if(graph.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        while(n>2){
            n -= leaves.size();
            for(Integer i : leaves) result.remove(i);
            List<Integer> newLeaves = new ArrayList<Integer>();
            for(int i = 0; i<leaves.size(); i++){
                int leave = (int)leaves.get(i);
                int link = graph.get(leave).iterator().next();
                graph.get(link).remove(leave);
                if(graph.get(link).size()==1) {
                    newLeaves.add(link);
                }
            }
            leaves = newLeaves;
        }
        return result;
    }
}
