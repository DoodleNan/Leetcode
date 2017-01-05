public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<=0 || t < 0) return false;
        TreeSet<Integer> values = new TreeSet<Integer>();
        for(int i = 0; i<nums.length; i++){
            Integer floor = values.floor(nums[i]+t);
            Integer ceil = values.ceiling(nums[i]-t);
            if((ceil != null && ceil <= nums[i]) || (floor != null && floor >= nums[i])) return true;
            values.add(nums[i]);
            if(values.size()>k) values.remove(nums[i-k]);
        }
        return false;
    }
}
