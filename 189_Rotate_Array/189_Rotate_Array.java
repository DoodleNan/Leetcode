public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i< length; i++){
            hm.put((i+k)%length,nums[i]);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            nums[entry.getKey()] = entry.getValue();
        }
    }
}
