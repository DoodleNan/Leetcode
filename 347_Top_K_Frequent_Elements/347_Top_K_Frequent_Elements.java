
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(!hm.containsKey(i)) hm.put(i,1);
            else hm.put(i,hm.get(i)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue(new Comparator<Map.Entry<Integer, Integer>>(){
            //@override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){
                return (int)(e2.getValue() - e1.getValue());
            }
        });
        pq.addAll(hm.entrySet());
        for(int i = 0; i<k; i++){
            result.add(pq.poll().getKey());
        }
        return result;
    }
}
