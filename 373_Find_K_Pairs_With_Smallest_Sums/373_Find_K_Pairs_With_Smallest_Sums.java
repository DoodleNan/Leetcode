public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<int[]>();
        if(nums1.length == 0 || nums2.length == 0) return result;
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for(int i = 0; i<nums1.length; i++) pq.offer(new Tuple(i,0,nums1[i] + nums2[0]));
        for(int i = 0; i<Math.min(k, nums1.length * nums2.length); i++){
            Tuple top = pq.poll();
            result.add(new int[]{nums1[top.x], nums2[top.y]});
            if(top.y+1<nums2.length) pq.offer(new Tuple(top.x, top.y+1, nums1[top.x]+nums2[top.y+1]));
        }
        return result;
    }
}

class Tuple implements Comparable<Tuple>{
    int x;
    int y; 
    int val;
    Tuple(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
    
    public int compareTo(Tuple t){
        return this.val-t.val;
    }
}
