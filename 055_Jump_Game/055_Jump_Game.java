public class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(i>max) break;
            max = Math.max(i+nums[i], max);
        }
        if(max>=nums.length-1) return true;
        else return false;
    }
}
