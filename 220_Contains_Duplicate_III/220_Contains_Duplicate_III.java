public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // if(k<=0 || t < 0) return false;
        // TreeSet<Integer> values = new TreeSet<Integer>();
        // for(int i = 0; i<nums.length; i++){
        //     Integer floor = values.floor(nums[i]+t);
        //     Integer ceil = values.ceiling(nums[i]-t);
        //     if((ceil != null && ceil <= nums[i]) || (floor != null && floor >= nums[i])) return true;
        //     values.add(nums[i]);
        //     if(values.size()>k) values.remove(nums[i-k]);
        // }
        // return false;
        HashMap<Long, Long> hm = new HashMap<Long, Long>();
        if(k<=0 || t<0) return false;
        for(int i = 0; i<nums.length; i++){
            long ID = getID(nums[i], (long)t+1);
            if(hm.containsKey(ID)) return true;
            else if(hm.containsKey(ID+1) && hm.get(ID+1)-nums[i]<=t) return true;
            else if(hm.containsKey(ID-1) && nums[i]-hm.get(ID-1)<=t) return true;
            hm.put(ID, (long)nums[i]);
            if(i>=k) hm.remove(getID(nums[i-k],(long)t+1));
        }
        return false;
    }
    
    private long getID(long num, long interval){
        return num<0?(num+1)/interval-1:num/interval;
    }

}
