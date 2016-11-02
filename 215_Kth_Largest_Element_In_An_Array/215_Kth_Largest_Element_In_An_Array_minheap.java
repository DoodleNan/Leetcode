public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(k);
        for(int i : nums){
            if(minheap.size()<k) minheap.offer(i);
            else{
                if(i>minheap.peek()){
                    minheap.poll();
                    minheap.offer(i);
                }
            }
        }
        return minheap.peek();
    }
}
