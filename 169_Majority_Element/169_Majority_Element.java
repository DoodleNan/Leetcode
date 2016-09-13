public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int result = 0;
        int fre = 0;
        for(int i = 0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
            if(hm.get(nums[i]) > fre){
                result = nums[i];
                fre = hm.get(nums[i]);
            }
        }
        return result;
    }
}
