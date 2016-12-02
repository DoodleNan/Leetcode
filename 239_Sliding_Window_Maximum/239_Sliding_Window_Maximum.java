public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k>nums.length || k<0) return new int[0];
        int length = nums.length;
        int []result = new int[length-k+1];
        int index = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i<length; i++){
            pq.offer(nums[i]);
            if(pq.size() == k){
                result[index++] = pq.peek();
                pq.remove(nums[i-k+1]);
            }
        }
        return result;
    }
}
