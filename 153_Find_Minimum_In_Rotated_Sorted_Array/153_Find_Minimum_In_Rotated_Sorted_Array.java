public class Solution {
    public int findMin(int[] nums) {
        int []helper = new int[nums.length*2];
        System.arraycopy(nums, 0, helper, 0, nums.length);
        System.arraycopy(nums, 0, helper, nums.length, nums.length);
        for(int i = 0; i<nums.length*2-1; i++){
            if(helper[i] >= helper[i+1]) return helper[i+1];
        }
        return 0;
    }
}
