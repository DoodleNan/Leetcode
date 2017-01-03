public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            int num = Math.abs(nums[i]);
            if(nums[num-1]>0) nums[num-1] = - nums[num-1];
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0) result.add(i+1);
        }
        return result;
    }
}
