public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int dim = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, Collections.reverseOrder());
        for(int i = 0; i<dim; i++){
            for(int j = 0; j<dim; j++){
                if(pq.size() < k) pq.offer(matrix[i][j]);
                else{
                    int max = (int)pq.peek();
                    if(matrix[i][j] < max){
                        pq.poll();
                        pq.offer(matrix[i][j]);
                    }
                }
            }
        }
        return (int)pq.poll();
    }
}
